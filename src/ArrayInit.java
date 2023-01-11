import java.util.Arrays;

public class ArrayInit {
  public static void main(String[] args) {
    int[] scores = new int[5];//자동 초기화 됨
    System.out.println(scores);
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i] + i); //score은 참조형 변수다. scores[i] primitive 변수다
    }

    //ArrayIndexOutOfBoundsException

    int[] s1 = {10, 20, 30, 40, 50}; //얘는 컴파일러가 new int를 넣어줌 , 얘만 기억하자
    int[] s2 = new int[]{10, 20, 30, 40, 50};
    //int[] s2 = new int[5]{10,20,30,40,50}// 이것도 안됨 ,중복으로 주는것이기 때문에
    int[] s3;
    s3 = new int[]{10, 20, 30, 40, 50};
    // int[] s4 ;
    //s4 = {10,20,30,40,50};//주소를 저장할 수 있는 참조변수인데 값을 넣으려고 하니까 오류

    System.out.println(Arrays.toString(s1));

    for (int e : s3) {
      System.out.println("정수 요소 출력:" + e);
    }

    char[] c = {'a', 'b', 'c'};
    System.out.println(c);  //abc
    for (char e : c) {
      System.out.println("문자 요소 출력:" + e);
    }

    String[] s = {"a", "b", "c"};
    System.out.println(s);

  }
}
