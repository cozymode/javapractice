package exception;

public class ExceptionTest {
  public static void main(String[] args) {
    int[] array = {0, 1, 2};
    String s = null; // String s = "" 초기화해야됨
    Object[] o = null;

    try {
      System.out.println(array[2]);
      System.out.println(5 / 1);
      System.out.println(s.length());
      System.out.println(o[0]);
    } catch (ArrayIndexOutOfBoundsException ae) {

      // ae.printStackTrace();
      System.out.println(ae.getMessage());

    } catch (ArithmeticException ar) {
      System.out.println(ar.getMessage());
    } catch (NullPointerException an) {
      System.out.println(an.getMessage());
    } catch (Exception e){
      System.out.println("예외가 발생하였습니다.");
    }

  }
}
