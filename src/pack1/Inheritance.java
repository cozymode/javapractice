package pack1;

public class Inheritance {

  public static void main(String[] args) {
    Circle c1 = new Circle();
    Ball b1 = new Ball("노랑");

    c1.getArea();
    c1.getRadius(); //protected는 같은 패키지에서 사용 가능
    
    b1.findArea();
    b1.findColor();
    b1.findArea();
    b1.getRa();

  }
}
