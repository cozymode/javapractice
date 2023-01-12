package pack8;

public class GenericTest2 {
  public static void main(String[] args) {
    Cup<Beer> c = new Cup<>();
    c.setBeverage(new Beer());
    Beer b1 = c.getBeverage();
   // c.setBeverage(new Boricha()); 오류, <Beer> 설정했기 때문

    Cup c1 = new Cup();
    //c1.setBeverage(new Beer());
    c1.setBeverage(new Boricha());

    Beer b = (Beer)c1.getBeverage();
  }
}
