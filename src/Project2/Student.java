package Project2;

//- 학생의 정보를 입력 받아서 컬렉션에 저장하고 순서대로 정렬해서 출력하라.
//- 입력된 과목의 평균이 가장 높은 학생순으로 출력하려고 한다.
//단, Student 객체에는 평균을 저장하는 필드가 없다.
//
//- ArrayList를 사용한다
//- 학생의 정보를 Student객체에 저장한다. 이름,학생번호,과목성적(영어, 프로그램,수학)
//- 학생정보는 이름 : ooo, 번호 : oooo, 과목성적 : 영어 - oo, 프로그램 - oo, 수학 - oo,
//평균 - oo 으로 출력하도록 Object의 toString 메소드를 재정의하시오
//- Student 객체는 비교를 위해 Comparable 인터페이스를 구현해서 작성하시오

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentMain {
  public static void main(String[] args) {
    String name = "";
    int stuNo = 0;
    int scoreEn = 0;
    int scorePro = 0;
    int scoreMath = 0;

    ArrayList<Student> arr = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      System.out.println("학생의 이름을 입력하세요.");
      Scanner s1 = new Scanner(System.in);
      name = s1.nextLine();
      System.out.println("학생의 번호를 입력하세요.");
      Scanner s2 = new Scanner(System.in);
      stuNo = s2.nextInt();
      System.out.println("영어 점수를 입력하세요.");
      Scanner s3 = new Scanner(System.in);
      scoreEn = s3.nextInt();
      System.out.println("프로그램 점수를 입력하세요.");
      Scanner s4 = new Scanner(System.in);
      scorePro = s4.nextInt();
      System.out.println("수학 점수를 입력하세요.");
      Scanner s5 = new Scanner(System.in);
      scoreMath = s5.nextInt();

      arr.add(new Student(name, stuNo, scoreEn, scorePro, scoreMath));

    }
    Collections.sort(arr);
    for (Student student : arr) {
      System.out.println(student.getName());
    }
  }
}

public class Student implements Comparable<Student> {

  String name = "";
  int stuNo = 0;
  int scoreEn = 0;
  int scorePro = 0;
  int scoreMath = 0;

  Student(String name, int stuNo, int scoreEn, int scorePro, int scoreMath) {
    this.name = name;
    this.stuNo = stuNo;
    this.scoreEn = scoreEn;
    this.scorePro = scorePro;
    this.scoreMath = scoreMath;
  }

  ;

  public String getName() {
    return name;
  }

  public int getStuNo() {
    return stuNo;
  }

  public int getScoreEn() {
    return scoreEn;
  }

  public int getScorePro() {
    return scorePro;
  }

  public int getScoreMath() {
    return scoreMath;
  }

  @Override
  public String toString() {
    return String.valueOf((this.scoreEn + this.scorePro + this.scoreMath) / 3);
  }

  @Override
  public int compareTo(Student o) {

    if (Integer.parseInt(this.toString()) < Integer.parseInt(o.toString())) {
      return 1;
    } else if (Integer.parseInt(this.toString()) == Integer.parseInt(o.toString())) {
      return 0;
    } else {
      return -1;
    }
  }
}
