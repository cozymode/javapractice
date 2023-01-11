package pack6;

public class TV implements Controllable {


  @Override
  public void turnOn() {
    System.out.println("TV 전원 ON");
  }

  @Override
  public void turnOff() {
    System.out.println("TV 전원 OFF");

  }

}
