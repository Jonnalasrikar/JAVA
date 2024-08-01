//abstact-existing in thought or as an idea but not having a physical or concrete existence
//abstract method-method that has been declared in an abstract class but without an implementation 
//abstract class-a class that contains one or more abstract methods
//ek abstract method pure class ko abstract class banatae he
//we can also assign refeerence to abstract class to the object of a concrete class
// in abstarct class there are also non abstarct methods
class AbstarctClassandAbstractMethods {
  public static void main(String args[]) {
    child1 c1 = new child1();
    parent c = new child1();
    // parent p = new parent();->thows error
    // child2 c2 = new child2();->thows error

  }
}

// abstrct class cannot be initiated
// but you need to implement all the abstract methods in child classess
// or your need to create new absract class which is derived from parent
// abstract class
// when a abstract class is subclassed, it must override all the abstract
// methods of the parent class
abstract class parent {// concerete class {
  public parent() {
    System.out.println("iam a constructor of parent class");
  }

  public void sayhello() {
    System.out.println("hello");
  }

  abstract public void greet();

  abstract public void greet2();
}

class child1 extends parent {
  @Override
  public void greet() {
    System.out.println("good morning");
  }

  @Override
  public void greet2() {
    System.out.println("good afternoon");
  }
}

abstract class child2 extends parent {
  public void th() {
    System.out.println("thank you");
  }
}