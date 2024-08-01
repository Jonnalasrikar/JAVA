import java.util.*;

class Linkedlist {
  public static void main(String args[]) {
    LinkedList<Integer> l1 = new LinkedList<>();
    LinkedList<Integer> l2 = new LinkedList<>();
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l2.add(70);
    l2.add(80);
    l2.add(90);
    l2.add(100);
    l1.add(0, 8);
    l1.add(0, 100);
    l1.addAll(0, l2);
    l1.set(1, 2000);
    l1.addLast(5000);
    l1.addFirst(200000);
    System.out.println(l1.contains(70));
    System.out.println(l1.indexOf(100));
    System.out.println(l1.lastIndexOf(100));
    System.out.println(l1);
    System.out.println(l2);

  }
}