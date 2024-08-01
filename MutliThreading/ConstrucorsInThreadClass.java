class ConstrucorsInThreadClass {
  public static void main(String args[]) {
    MyThread t1 = new MyThread("srikaar");
    MyThread t2 = new MyThread("rajja");
    t1.start();
    t2.start();
    // getId()-to get the id of the thread
    System.out.println("The id of the thread is" + t1.getId());
    System.out.println("The name of the thread is " + t1.getName());
    System.out.println("The id of the thread is" + t2.getId());
    System.out.println("The name of the thread is " + t2.getName());

  }
}

class MyThread extends Thread {
  // name -the name of the new thread
  // name is referring to thread
  public MyThread(String Name) {
    super(Name);
  }

  public void run() {
    int i = 0;
    while (i < 20) {
      System.out.println("Iam a thread");
      i++;
    }
  }
}
