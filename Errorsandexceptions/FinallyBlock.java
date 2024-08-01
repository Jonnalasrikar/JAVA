/*
finally block contains the code which is always executed whether the exception is thrown or not
It is used to execute code containing instructions to release the system resoruces,close a connections etc

iscode ko execute karna zarure hota he
after returning also it exceutes
*/

class FinallyBlock {
  public static void main(String args[]) {
    int k = greet();
    System.out.println(k);

  }

  public static int greet() {
    try {
      int a = 50;
      int b = 10;
      return a / b;
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("This is the end of function");
    }
    System.out.println("This is also end of function");
    return 0;

  }
}