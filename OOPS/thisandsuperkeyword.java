//this-is a way for us to refer to the current object of the class is beign created /referenced
//superkeyword is a reference variable used to refer immediate parent class object
// can be used to refer immediate parent class object
//can be used to invoke parent class methods
//can be used to invoke parent class constructors
class thisandsuperkeyword {
  public static void main(String args[]) {
    ekclass e = new ekclass(65);
    doclass d = new doclass(5);
    e.getA();
  }
}

class ekclass {
  int a;

  ekclass(int a) {
    this.a = a;// reference to current object
  }

  public void getA() {
    System.out.println(a);
  }

  public int returnone() {
    return 1;
  }
}

class doclass extends ekclass {
  doclass(int c) {
    super(c);//to invoke custom constructor use super keyword
    System.out.println("mai ekclass ka constructor hoon");
  }
}