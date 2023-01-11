package pack5;

public class Rectangle extends Shape {
  int width;
  int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }

}
