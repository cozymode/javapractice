public class GetSetDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
    //c.radius = 3; private로 하면 c.radius로 접근 못함
    c.setRadius(30);
    System.out.println(c.getRadius());
    System.out.printf("%.2f", c.findArea());

    c.setRadius(0);
  }

}

class Circle {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    if (radius == 0) {
      System.out.println("원의 반지름은 0보다 커야합니다.");
    } else if (radius > 100) {
      System.out.println("원의 반지름은 100보다 작아야합니다.");
    } else {
      this.radius = radius;
    }

  }

  double findArea() {
    return 3.14 * radius * radius;
  }

}
