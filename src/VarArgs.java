public class VarArgs {
  public static void main(String[] args) {
    printSum(1, 2, 3, 4, 5);
    printSum(10, 20, 30);
  }


  //v가 배열로 됨
  public static void printSum(int... v) {
    int sum = 0;
    for (int num : v) {
      sum += num;
    }
    System.out.println("전체 숫자의 합은 " + sum);
  }

}
