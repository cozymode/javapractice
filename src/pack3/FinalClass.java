package pack3;

public class FinalClass {

  public static void main(String[] args) {
  }
}

class Good {//조상

}

class Better extends Good {

}

//final을 붙여서 Best 만들면, 다른곳에서 상속 불가능
final class Best extends Better {//자식


}
