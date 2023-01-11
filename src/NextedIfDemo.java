import java.util.Scanner;

public class NextedIfDemo {

  public static void main(String[] args) {
    int score = 93;
    String grade = "F";
    Scanner sc = new Scanner(System.in);

    score = sc.nextInt();

    if (score >= 90)
      if (score > 96)
        grade = "A+";
      else
        grade = "A0";

    System.out.println(grade);
  }
}
