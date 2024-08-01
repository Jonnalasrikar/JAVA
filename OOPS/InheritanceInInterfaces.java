//interface can extends another interfaces
class InheritanceInInterfaces {
  public static void main(String args[]) {
    mysampleclass obj = new mysampleclass();
    obj.meth1();

  }
}

interface sampleInterface {
  void meth1();

  void meth2();
}

// interface to interface extends inheritances but a class cannot extends the
// interface it only implements
interface childSampleInetrface extends sampleInterface {
  // dry-dont repeat yourself
  // void meth1();
  // void meth2();
  void meth3();

  void meth4();
}

class mysampleclass implements childSampleInetrface {
  public void meth3() {
    System.out.println("meth3");
  }

  public void meth4() {
    System.out.println("meth 4");
  }

  public void meth1() {
    System.out.println("meth1");
  }

  public void meth2() {
    System.out.println("meth2");
  }
}