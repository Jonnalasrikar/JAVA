import java.util.ArrayList;

/*
Intriduced from 5.o onwards
very similar to c++ templates(but not the same)
Hence generics aim to reduce bugs and enhance type safety
*/

class javagenerics {
  public static void main(String args[]) {
    // <generics>->specifying the data types of the any type of object
    // ArrayList<Integer>->this is correct
    // ArrayList<int>->this is incorrect int is primitive data type this will
    //type parameter in java generics cannot be primitive data type
    // produce error
    // ArrayList<Integer> a = new ArrayList<>();
    // ArrayList m = new ArrayList();
    // a.add(17);
    // a.add(643);
    // int b = a.get(1);
    // System.out.println(b);

    // m.add("srikar");
    // m.add(19.6);
    // m.add(21);
    // int c=m.get(2);->we cant do this
    // int c = (int) m.get(2);// we can do this
    // System.out.println(c);
    // int l = (int) m.get(0);//we cannnot do this
    // System.out.println(l);
    Mygenerics<String, String> g1 = new Mygenerics(333, "srikar", "hello");
    String a = g1.getT1();
    String b = g1.getT2();
    System.out.println(a + b);

  }
}

// <T1> generic type argument
class Mygenerics<T1, T2> {
  int val = 333;
  private T1 t1;
  private T2 t2;

  public Mygenerics(int val, T1 t1, T2 t2) {
    this.val = val;
    this.t1 = t1;
    this.t2 = t2;
  }

  public void setValue(int val) {
    this.val = val;
  }

  public void setT1(T1 t1) {
    this.t1 = t1;
  }

  public void setT2(T2 t2) {
    this.t2 = t2;
  }

  public int getval() {
    return val;
  }

  public T1 getT1() {
    return t1;
  }

  public T2 getT2() {
    return t2;
  }
}