package pack7;

public class Car implements Movable {

  @Override
  public void move() {
    System.out.println("자동차는 10만큼 움직인다.");
  }

  public void show() {
    System.out.println("자동차가 보인다.");
  }

}
