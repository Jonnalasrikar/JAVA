class ConstructorinInheritance {
  public static void main(String args[]) {
    // parent p = new parent();
    // if you create a object for child class it calls for the both child and parent
    // constructor
    // initially it calls for parent class constructor then child class constructor
    // child1 c = new child1();
    child1 c1 = new child1(4, 9);

  }
}

class parent {
  parent() {
    System.out.println("iam a parent class  constructor");
  }

  parent(int a) {
    System.out.println("Iam a overloaded constructor iam a parent class parameterized constructor with value" + a);
  }

  public int x;

  public void setx(int n) {
    x = n;
  }

  public void getx() {
    System.out.println(x);
  }
}

class child1 extends parent {
  child1() {
    // super(0);
    System.out.println("iam a child1 class constructor");
  }

  child1(int x, int y) {
    super(x);
    System.out.println("iam a child1 class constructor with value" + x + " " + y);
  }

  public int y;

  public void sety(int n) {
    y = n;
  }

  public void gety() {
    System.out.println(y);
  }

}