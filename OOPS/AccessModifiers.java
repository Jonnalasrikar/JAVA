// access modifies determine whether other classess can use a particular filed or invoke a particular method can be public, private, protected, default
// Modifier	Class	Package	Subclass	World
// public	Y	Y	Y	Y
// protected	Y	Y	Y	N
// no modifier	Y	Y	N	N
// private	Y	N	N	N
package sri;

class AccessModifiers {
  public static void main(String args[]) {
    c1 c = new c1();
    // c.meth1();
    // System.out.println(c.x);
    // System.out.println(c.y);
    // System.out.println(c.z);
    // System.out.println(c.a);
  }
}

class c1 {
  public int x = 5;
  protected int y = 30;
  int z = 6;
  private int a = 22;

  public void meth1() {
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(a);
  }
}