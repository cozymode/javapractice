package pack1;

public class Circle {

  private void secret() {
    System.out.println("secret");
  }

  protected void findRadius() {
    System.out.println("radius is 10.0");
    secret();//같은클래스 내에서는 사용 가능
  }

  public void findArea() {
    System.out.println("넓이는 3.14*10.0*10.0");
  }
}
