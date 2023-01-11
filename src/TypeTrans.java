public class TypeTrans {

  public static void main(String[] args) {
    int a = 3;
    char c = '3';
    System.out.println(a+'0'); //51
    System.out.println(c-'0'); //3(숫자 3)

    System.out.println(3+""); //3(문자열 3)
    System.out.println('3'+"");//3(문자열 3)

    String s = "3";
    System.out.println(Integer.parseInt(s)); //3 문자열

    String s1 = "3.14";
    System.out.println(Double.parseDouble(s1)); //3.14 문자열

    System.out.println(s.charAt(0)); //3
    System.out.println(s1.charAt(1)); //.

  }
}
