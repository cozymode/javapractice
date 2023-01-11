package pack5;

class Circle extends Shape {

  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }
}
