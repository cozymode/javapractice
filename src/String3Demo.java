public class String3Demo {

  public static void main(String[] args) {
    String s1 = "hello java";
    String s2 = "hello java";
    String s3 = new String("hello java");
    String s4 = new String("hello java");

    System.out.println(s1.toUpperCase());
    System.out.println(s1);
    System.out.println(s1.substring(3));
    System.out.println(s1.substring(3,7));

    String s5 = "";
    String s6 = " ";
    String s7 = null; // blank와 결과는 같음
    System.out.println(s5.isEmpty());
    System.out.println(s6.isEmpty());
    System.out.println(s7.isEmpty());

  }
}
