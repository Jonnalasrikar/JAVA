import java.util.*;

class MultipleInheritance {
  public static void main(String args[]) {
    smartphone s = new smartphone();
    String a[] = s.getnetwork();
    System.out.println(Arrays.toString(a));
  }
}
//
interface camera {
  public void takesnap();

  void recordvideo();
  // private void greet()
  // {
  //   System.out.println("hello");
  // }

  // void record4kvideo();
  //you can override this
  //it is not forcing classes to implement this method
  // default void record4kvideo()
  // {
  //   System.out.println("Recording in 4k...");
  // }
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
}