public class ArithmeticDemo {
  public static void main(String[] args) {
    //int result1 = 5/0;
    //System.out.println(result1); error

    double result2 = 5/0.0;
    System.out.println(result2); // Infinity

    double result3 = 5%0.0;
    System.out.println(result3); //Nan Not a number

    if(Double.isInfinite(result2) || Double.isNaN(result3)){
      System.out.println("산술 연산을 할 수 없습니다.");
    }else{

    }

    int x = 25;
    int y = 2;

    int z = x%y;

    System.out.printf("%d를 %d로 나눈 나머지는 %d입니다.",x,y,z);

  }
}
