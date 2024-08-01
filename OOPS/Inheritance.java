//inheritance is used to borrow properties and methods from one class to another
//parentclass ->childclass
//superclass-> subclass
//inheritance ->to declare inheritance use extends keyword
//all the methods and properites can be accessed by the child class it only accesss the public methods and properties
class Inheritance {
  public static void main(String args[]) {
    // deriving object for parent class
    // parent class cannot access the child class
    parentclass p = new parentclass();
    p.setx(4);
    System.out.println(p.getx());
    // deriving object for child class
    // child class can access the parent class
    childclass b = new childclass();
    b.setx(98);
    System.out.println(b.getx());
  }
}

class parentclass {

  int x;

  public void setx(int n) {
    System.out.println("iam setting x now iam in parent class");
    x = n;
  }

  public int getx() {
    return x;
  }

  public void parentclass() {
    System.out.println("Iam a parent class");
  }
}

class childclass extends parentclass {
  int y;

  public void sety(int n) {
    System.out.println("iam setting y now iam in child class");
    y = n;
  }

  public int gety() {
    return y;
  }

  public void childclass() {
    System.out.println("Iam a child class");
  }
}
