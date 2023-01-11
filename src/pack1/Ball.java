package pack1;

public class Ball extends Circle {

  private String color;

  public Ball(String color) {
    this.color = color;
  }

  public void getColor() {
    System.out.println(color);
    ;
  }

  @Override
  public void findArea() {
    System.out.println("넓이는 4*(ㅠ*반지름*반지름)이다.");
  }

  @Override
  protected void findRadius() {
    System.out.println("반지름");
  }
}
