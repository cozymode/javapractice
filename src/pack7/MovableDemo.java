package pack7;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move();

    Car c = (Car)m;
    c.show();//이제 show 보임
    c.move();

  }
}
