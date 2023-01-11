package pack6;

/**
 * @implSpec 모든 전자 제품의 기능을 제어할 수 있는 interface
 * @return void
 * @param
 *
 */
public interface Controllable {

  default void repair() {
    show("장비를 수리한다.");
  }

  static void reset() {
    System.out.println("장비를 초기화한다.");
  }

  private void show(String s) {
    System.out.println(s);
  }

  void turnOn();

  void turnOff();

}
