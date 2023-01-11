public class StringCompare {
  public static void main(String[] args) {
    String s1 = "hello java";
    String s2 = "hello java";

    //s1 -> 주소, s2->주소

    System.out.println(s1==s2); //주소가 같음
    System.out.println(s1.equals(s2)); //주소에 갔더니 string의 값이 같음


    String s3 = new String("hello java");
    String s4 = new String("hello java");

    System.out.println(s1==s3); //달라,
    System.out.println(s3==s4); //달라,

    s1=s3;
    System.out.println(s1==s3); // 같아

  }
}
