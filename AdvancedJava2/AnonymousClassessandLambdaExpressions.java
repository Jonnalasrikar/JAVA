/*
Added in java 8
Lambda expressions let us express instances of single method classes more compactly
An anonymous class is a classess are used to implement a  base class without giving it a name
Anaonymous classes are used to implement a base class without giving it a name
Lambda expressions are used to implement a base class without giving it a name
For classes with a single method, even anaonymous classes get slightly excessive and lumbersome

*/

class AnonymousClassessandLambdaExpressions {
  public static void main(String args[]) {
    // AnonyDemo a = new AnonyDemo();
    // sri obj = new AnonyDemo();
    // obj.sayhi();
    // a.display();
    // a.sayhi();

    /*
     * anonymous class
     * sri obj = new sri() {
     * public void sayhi() {
     * System.out.println("hi!!!!");
     * }
     * 
     * public void sayhowareyou() {
     * System.out.println("how are you???");
     * }
     * 
     * };
     * obj.sayhi();
     */

    // lambda expression
    // Demoano obj = new harryfunc();
    // obj.sayhi();
    Demoano obj = (a) -> {
      System.out.println("hiii!!!" + a);
    };
    obj.sayhi(6);

  }
}

@FunctionalInterface
interface Demoano {
  void sayhi(int a);

  // void sayhowareyou();
}

// class harryfunc implements Demoano {
// @Override
// public void sayhi() {
// System.out.println("hi!!!!!");
// }
// }
//

// class AnonyDemo implements sri {
// public void display() {
// System.out.println("hello!!!!");
// }

// public void sayhi() {
// System.out.println("hi!!!!");
// }

// public void sayhowareyou() {
// System.out.println("how are you???");
// }
// }
