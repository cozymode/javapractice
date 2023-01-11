public class ArgsArray {

  public static void main(String[] args) {

    System.out.println(args[0]);
    System.out.println(Integer.parseInt(args[1]));
    if (args.length > 0) {
      for (int i = 0; i < Integer.parseInt(args[1]); i++) {
        System.out.println(args[0]);
      }
    }

  }
}
