public class Constructor {
  public static void main(String[] args) {
//    Circle2 c1 = new Circle2();//10.0, 파란
//
//    Circle2 c2 = new Circle2(3.0);//3.0 빨간색
//
//    Circle2 c3 = new Circle2("yellow"); //5.0 yellow
//
//    c1.color = "red";
//    c2.color = "red";
//    c3.color = "red";
//
//    c1.radius = 3.0;
//    c2.radius = 3.0;
//    c3.radius = 3.0;


    //배열 만들기
    Circle2[] c = new Circle2[5]; //그 객체를 가리키는 주소가 들어가게 됨
    for (int i = 0; i < 3; i++) {
      c[i] = new Circle2();
      c[i].color = "red";
      c[i].radius = 3.0;
    }
    for (int i = 0; i < c.length; i++) {
      System.out.println(c[i]);
      System.out.println(c[i].color);
      System.out.println(c[i].radius);
    }

  }
}


class Circle2 {
  String color = "";//nullpointerexception이 나오지 않도록 "" 웬만하면 하기
  double radius = 10.0;

  Circle2() {
    this(10.0); //맨 앞에 넣어야 함
    this.color = "파란";
  }

  Circle2(double radius) {
    this.radius = radius;
    this.color = "빨강";
  }

  Circle2(String color) {
    this.radius = 5.0;
    this.color = color;
  }

}
