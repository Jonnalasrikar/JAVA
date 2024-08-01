//concurrency is the ability of a program to run and manage multiple tasks at the same time can be done by single processing unit
//ek time ko ek task he execute hora he
//parallism is task of running  multiple tasks at the same time
//at a instant mutliple tasks are running at a time
//suppose fn1() is taking 20 minutes concurrently it also executes the fn2()
class CreatingThreadByExtendingClass {
  public static void main(String args[]) {
    Mythread1 t1 = new Mythread1();// threads are giving some time to all the threads one by one
    Mythread2 t2 = new Mythread2();
    t1.start();//start method is used to start the exeuction of the thread
    t2.start();
  }
}

class Mythread1 extends Thread {
  @Override
  public void run() {
    int i = 0;
    while (i < 4000) {
      System.out.println("My cooking thread1 is running");
      System.out.println("Iam happy");
      i++;
    }
  }
}

class Mythread2 extends Thread {
  @Override
  public void run() {
    int i = 0;
    while (i < 4000) {
      System.out.println("Thread 2 for chatting with her");
      System.out.println("Iam sad");
      i++;
    }
  }
}