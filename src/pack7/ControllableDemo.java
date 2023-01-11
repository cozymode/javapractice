package pack7;

import pack6.Computer;
import pack6.Controllable;
import pack6.TV;

public class ControllableDemo {
  public static void main(String[] args) {
    Controllable[] controllables = {new TV(), new Computer()};


    for (Controllable c : controllables) {
      c.repair();
      c.turnOn();
      c.turnOff();
    }

    Controllable.reset();

  }
}
