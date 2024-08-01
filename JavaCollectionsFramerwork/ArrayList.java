import java.util.*;

class Arraylist {
  public static void main(String args[]) {
    // generics-generics is a mechanism to write generic code
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>(5);
    arr2.add(70);
    arr2.add(80);
    arr2.add(90);
    arr2.add(100);
    arr.add(5);
    arr.add(6);
    arr.add(7);
    arr.add(0, 8);
    arr.add(0, 100);
    arr.addAll(0, arr2);
    arr.set(1, 2000);
    // arr.clear();
    System.out.println(arr.contains(70));
    System.out.println(arr.indexOf(100));
    System.out.println(arr.lastIndexOf(100));
    System.out.println(arr);
    // for (int i = 0; i < arr.size(); i++) {
    // System.out.println(arr.get(i));
    // }

  }
}