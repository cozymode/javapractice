package pack6;

public class ControllableDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    Computer c = new Computer();

    tv.turnOn();
    tv.turnOff();
    tv.repair();
    c.turnOn();
    c.turnOff();
    c.repair();
    Controllable.reset();
  }
}
