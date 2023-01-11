public class Method1Demo {

  public static void main(String[] args) {
    int res = sum(1,10);
    System.out.println("합(1~10):"+res);

    System.out.println("합(10~100):"+sum(10,100));

    System.out.println("합(100~1000):"+sum(100,1000));



  }

  public static int sum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;

  }

}
