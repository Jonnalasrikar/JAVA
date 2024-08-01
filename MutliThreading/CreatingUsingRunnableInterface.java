//bullet ko directly throw nahi kar sakathe
//it need gun
class CreatingUsingRunnableInterface {
  public static void main(String args[]) {
    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    Thread gun1 = new Thread(bullet1);
    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    Thread gun2 = new Thread(bullet2);
    gun1.start();
    gun2.start();
  }
}

class MyThreadRunnable1 implements Runnable {
  public void run() {
    while (true) {
      System.out.println("Iam a thread1 not a threat1 ");
    }

  }
}

class MyThreadRunnable2 implements Runnable {
  public void run() {
    while (true) {
      System.out.println("Iam a thread2 not a threat2 ");
    }
  }
}