package pack9;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("나비");
    System.out.println(list.size());
    list.add("다람쥐");
    System.out.println(list.size());
    list.add(2,"나비");
    list.add("개구리");
    System.out.println(list.size());
    list.add("나비");
    System.out.println(list.size());
    System.out.println(list.indexOf("다람쥐"));
    list.remove("나비");
    list.set(list.size()-1,"강아지");


  }
}
