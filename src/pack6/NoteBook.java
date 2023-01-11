package pack6;

public class NoteBook extends Computer implements Portable {

  @Override
  public void inMyBag() {
    System.out.println("노트북은 가방에 있다.");
  }

  @Override
  public void repair() {
    System.out.println("노트북을 수리한다.");
  }

  @Override
  public void turnOn() {
//    super.turnOn();
    System.out.println("노트북 전원 ON");
  }

  @Override
  public void turnOff() {
//    super.turnOff();
    System.out.println("노트북 전원 OFF");
  }


  public static void main(String[] args) {
    NoteBook n = new NoteBook();

    n.turnOn();
    n.turnOff();
    n.inMyBag();
    n.repair();
  }

}
