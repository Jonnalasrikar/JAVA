//java virtual machine -if there are multiple threads 
// ready queue:t1 t2 t3 t4 t5
//the jvm defines a range of ten logical priorities for java threads ,including java.lang.Thread.MIN_PRIORITY=1 and java.lang.Thread.MAX_PRIORITY=5 and the default priority is java.lang.Thread.NORM_PRIORITY=3
class JavaThreadPriorities {
  public static void main(String args[]) {
    Mythread t1 = new Mythread("srikar1");
    Mythread t2 = new Mythread("srikar2");
    Mythread t3 = new Mythread("srikar3");
    Mythread t4 = new Mythread("srikar4");
    Mythread t5 = new Mythread("srikar5(most Important)");
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}

class Mythread extends Thread {
  public Mythread(String name) {
    super(name);
  }

  public void run() {
    while (true) {
      System.out.println("Thank you" + this.getName());
    }
  }
}