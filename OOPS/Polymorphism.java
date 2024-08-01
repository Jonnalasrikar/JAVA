//ek chese alag alag form
class Polymorphism {
  public static void main(String args[]) {
    // similar to dynamic dispatch in inheritance
    camera cam1 = new smartphone();
    // this is a smartphone use it as camera
    // you can only use camera methods
    // cam1.getnetwork(); not allowed for good
    // cam1.samplemeth(); not allowed
    cam1.recordvideo();
    smartphone s = new smartphone();
    s.samplemeth();
    s.recordvideo();
    s.callno(96666);

  }
}

interface camera {
  public void takesnap();

  void recordvideo();
}

interface wifi {
  String[] getnetwork();

  void conectnetwork(String network);

}

class cellphone {
  void callno(int no) {
    System.out.println("calling" + no);
  }

  void pickcall() {
    System.out.println("connecting");
  }
}
//implementing an interface forces method implementation
class smartphone extends cellphone implements camera, wifi {
  public void takesnap() {
    System.out.println("taking snap");
  }

  public void recordvideo() {
    System.out.println("recording video");
  }

  public String[] getnetwork() {
    System.out.println("getting network list");
    String[] networklist = { "harry", "srikar", "jonnala" };
    return networklist;
  }

  public void conectnetwork(String network) {
    System.out.println("connecting" + network);
  }

  public void samplemeth() {
    System.out.println("sample method");
  }
}