class PracticeSet13 {
  public static void main(String args[]) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t1.setPriority(6);
    t2.setPriority(9);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    t2.start();
    System.out.println(t2.getState());
    System.out.println(Thread.currentThread().getState());
    // t1.start();
  }
}

class Mythread1 extends Thread {
  public void run() {
    int i = 0;
    while (i < 20) {
      System.out.println("good morning!!!");
      i++;
    }
  }
}

class Mythread2 extends Thread {
  public void run() {
    int i = 0;
    while (i < 20) {
      // try {
      // Thread.sleep(200);
      // } catch (Exception e) {
      // System.out.println(e);

      // }
      System.out.println("welcome!!!");
      i++;
    }
  }
}