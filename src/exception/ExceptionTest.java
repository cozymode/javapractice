package exception;

import java.util.Scanner;

public class ExceptionTest {
  public static void main(String[] args) {
    int[] array = {0, 1, 2};
    String s = null; // String s = "" 초기화해야됨
    Object[] o = null;

    Scanner in = new Scanner(System.in);


    try {
      System.out.println(array[2]);
      System.out.println(5 / 1);
      //System.out.println(s.length());
      //System.out.println(o[0]);
      square(in.nextLine());
    } catch (ArrayIndexOutOfBoundsException ae) {

      // ae.printStackTrace();
      System.out.println(ae.getMessage());
//
    } catch (ArithmeticException ar) {
      System.out.println(ar.getMessage());
    } catch (NullPointerException an) {
      System.out.println(an.getMessage());
    } catch (NumberFormatException ne) {
      System.out.println("정수 포맷 오류 발생 ");
    }

  }

  private static void square(String s) throws NumberFormatException {
    //s를 어떤 타입으로 넣은지도 모르는데 int형으로 변환
    int n = Integer.parseInt(s);
    System.out.println(n * n);
  }

}
