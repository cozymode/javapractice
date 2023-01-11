

class Phone {
  String name;
  int value;

  Phone(String name, int value) {
    this.name = name;  //this.name은 전역변수, name은 지역변수
    this.value = value; //this.value은 전역변수, value은 지역변수
    //모호한 상황을 피하기 위해서? name=name; 으로하면 프로그램은 잘모름
  }

  void print() {
    System.out.println(value + "만원 짜리 " + name + " 스마트폰");
  }

}

public class PhoneDemo {

  public static void main(String[] args) {
    Phone p1 = new Phone("갤럭시 S8", 100);
    p1.print();

    Phone p2 = new Phone("G5", 85);
    p2.print();

    Phone p3 = new Phone("아이폰", 185);
    p3.print();
  }

}
