public class IncrementDemo {
  public static void main(String[] args) {
    int[] x = {0};
    System.out.println("메소드 호출 전 x[0] ==> " + x[0]);
    increment(x);
    System.out.println("메소드 호출 후 x[0] ==> " + x[0]);
  }

  //static으로 만들면 객체 안만들고 호출 가능
  public static void increment(int[] n) {
    System.out.println("메소드 안에서의 n[0] ==> " + n[0]);

    n[0]++;

    System.out.println("메소드 안에서의 n[0]==>" + n[0]);
  }

}
