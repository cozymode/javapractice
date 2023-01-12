package pack10;

import java.util.Arrays;

public class Comparator {
  public static void main(String[] args) {
    String[] s = {"12345678910", "12345", "123"};

//    Arrays.sort(s, new java.util.Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    });

    Arrays.sort(s,(s1, s2)->s1.length()-s2.length());

    for (String str : s) System.out.println(str);
  }
}
