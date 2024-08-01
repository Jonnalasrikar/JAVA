/*
Annotations in java:
Used to add metadata to the java code/class/method
used to provide extra information about a program
Following are some common annotations built into java
1.@Override->used to mark overridden elements in the child classes
2.@suppressesWarnings->used to suppress the generated warnings by the compiler
3.@Deprecate->used to mark deprecated methods
4.@Depricated->used to mark deprecated classes
5.Functional Interface->used to ensure an interface is functional interface-only one abstract method contains in interface


*/

class Annotations {
  @SuppressWarnings("deprecation")
  public static void main(String args[]) {
    child c = new child();
    c.time();
    c.sum(5, 6);
  }
}

@FunctionalInterface
interface myFunctionalInterface {
  void thisMethod();
}

class parent {
  void time() {
    System.out.println("time is 6 am!!!!!!");
  }

  void hello() {
    System.out.println("hello!!!!!!!");
  }
}

class child extends parent {
  @Override
  public void time() {
    System.out.println("time is 6 pm!!!!!!");
  }

  @Deprecated
  public int sum(int a, int b) {
    return a + b;
  }
}
