package pack9;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();

    try {
      q.remove();
    }catch(NoSuchElementException ne){
      System.out.println("삭제 할 요소가 없습니다.");
    }
    q.add("사과");
    q.add("포도");
    q.add("체리");


  }
}