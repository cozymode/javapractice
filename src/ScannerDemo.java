import java.util.Scanner;

public class ScannerDemo {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);


    System.out.println("첫번째 값을 입력해주세요.");

    String s1 = in.nextLine();
    System.out.println("두번째 값을 입력해주세요.");
    String s2 = in.nextLine();

    System.out.println("첫번쨰 입력한 값은:" + s1 + "입니다.");
    System.out.println("두번쨰 입력한 값은:" + s2 + "입니다.");

    int i1 = Integer.parseInt(s1);
    int i2 = Integer.parseInt(s2);
    //System.out.println(i1);

    System.out.println(i1 * i2);

    System.out.printf("%d 곱하기 %d는 %d 입니다.", i1, i2, i1 * i2);


  }
}
