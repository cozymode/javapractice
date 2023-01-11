public class CallbyValue {

  public static void main(String[] args) {

    MyMath m = new MyMath();
    long res1 = m.add(2L, 3L);
    System.out.println(res1);

  }
}

class MyMath {
  long add(long a, long b) {
    return a + b;
  }

  long sub(long a, long b) {
    return a - b;
  }

  long mul(long a, long b) {
    return a * b;
  }

  long div(long a, long b) {
    return a / b;
  }

}