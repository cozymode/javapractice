package pack9;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> s1 = new Stack<>();

    System.out.println(s1.empty());
    s1.push("고양이");
    s1.push("강아지");
    s1.push("호랑이");

    System.out.println(s1); //
    System.out.println(s1.peek());
    System.out.println(s1.pop());
    System.out.println(s1);
    System.out.println(s1.search("고양이"));


    Stack<Integer> s2 = new Stack<>();

    s2.add(10);

  }
}
