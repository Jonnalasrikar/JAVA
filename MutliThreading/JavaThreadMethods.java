class JavaThreadMethods {
  public static void main(String args[]) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    // both t1 and t2 are stated concurently
    t1.start();
    // join is used to wait for the thread to complete
    // try {
    // t1.join();
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    t2.start();

  }
}

class Mythread1 extends Thread {
  public void run() {
    // int i = 0;
    while (true) {
      System.out.println("Iam in thread 1 !!!");
      // i++;
      try {
        Thread.sleep(5);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class Mythread2 extends Thread {
  public void run() {
    // int i = 0;
    while (true) {
      System.out.println("Iam in thread 2!!!");
      // i++;
    }
  }
}