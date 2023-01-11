public class DatatypeDemo {

  public static void main(String[] args) {
    char a1 = 'A';
    char a2 = 65;
    char a3 = '\u0041';

    System.out.println(a1); //A
    System.out.println(a2); //A
    System.out.println(a3); //A

    System.out.println((int)a1); // 65
    System.out.println((int)a2); //65
    System.out.println((int)a3); //65

    char ga1 = '가';
    char ga2 = '\uac00';

    boolean c = true;
    boolean g = false;


    System.out.println(ga1);  //가
    System.out.println((int)ga1); //44032
    System.out.println(ga2); //가
    System.out.println(++ga2); //각
    System.out.println(c+"가 아니면"+g+"입니다.");

  }
}
