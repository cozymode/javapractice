package pack8;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(100);
    //list.add("200");
    //list.add("abc");

    list.add(300);
    list.add(500);

    // Integer로 넣었으니까 형번환 할 필요없음

    int i = list.get(0);
    System.out.println(i);

//    //만약 다 숫자면
//    int i = (Integer) list.get(0);
//    castCheck(list.get(0))
//    System.out.println("i" + i);
//    //Integer i2 = (Integer)list.get(1);
//    //String i2 = (String) list.get(1);
//    System.out.println(i2);
//    System.out.println(list);
  }

  public static Object castCheck(Object o) {
    if (o instanceof Integer) {

    }

    if (o instanceof String) {

    }
    return o;
  }


}
