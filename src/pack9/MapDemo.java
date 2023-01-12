package pack9;


import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {

    Hashtable<String,Integer> h = new Hashtable<>();
    h.put("사과",3);
    System.out.println(h);
    h.put("사과",5);
    System.out.println(h);

    Map<String, Integer> fruits =
        Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");
    System.out.println(fruits);

    for (String key : fruits.keySet())
      System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");

    fruits.forEach((k, v) -> System.out.print(k + "," + v));

    String key = "바나나";
    if (fruits.containsKey(key))
      System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");

    fruits.forEach((k, n) -> System.out.print(k + "(" + n + ") "));

//        fruits.put("키위", 2);
//        fruits.remove("사과");
//        fruits.clear();
  }
}