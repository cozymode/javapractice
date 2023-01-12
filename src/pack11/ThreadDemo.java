package pack11;

public class ThreadDemo {

  public static void main(String[] args) {
    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println(Thread.currentThread() + "잘가");
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {

          }

        }
      }
    }).start();

    for (int i = 0; i < 5; i++) {

      System.out.println(Thread.currentThread() + "안녕");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {

      }

    }
  }

}

//class MyRunnable implements Runnable {
//  @Override
//  public void run() {
//    for (int i = 0; i < 5; i++) {
//      System.out.println(Thread.currentThread() + "잘가");
//      try {
//        Thread.sleep(500);
//      } catch (InterruptedException e) {
//
//      }
//
//    }
//  }
//}
