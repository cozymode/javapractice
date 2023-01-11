public class CircleTest {

  public static void main(String[] args) {
    Circle3 c1 = new Circle3(100.0,"빨강");

    System.out.println("공의 색깔은 " + c1.getColor() + "이고,반지름은 " + c1.getRadius() + "입니다. 총 공의 개수는 " + c1.numberOfCircles + "개 입니다.");

    Circle3 c2 = new Circle3(50.0,"노랑");
    System.out.println("공의 색깔은 " + c2.getColor() + "이고,반지름은 " + c2.getRadius() + "입니다. 총 공의 개수는 " + Circle3.numberOfCircles + "개 입니다.");
  }

}

class Circle3 {

  private double radius;
  private String color = "";
  static int numberOfCircles = 0;

  Circle3(double radius, String color){
    this.radius = radius;
    this.color = color;
    ++numberOfCircles;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


}