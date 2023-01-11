public class TypeDemo {

  public static void main(String[] args) {
    int i = 'A'; // int(4) > char(2) , 65 -> 컴파일러 자동형변환
    double d = 3.14f; // double(8) > float(4) -> 컴파일러 자동형변환

    //int ie = 10_000_000_000; int범위 20억을 벗어난 오류
    //long l = 3.14f; // long 값의 범위 < float 값의 범위
    //float f = 3.14; // float < double

    byte b = 100;
    //byte be = 128; // -128~127 범위 벗어나면 오류

    int a = 100;
    //byte be = a; // 형변환해서 대입해야함

    byte be = (byte)a;

  }
}
