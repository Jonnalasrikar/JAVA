
//double ended queue->queue which can be used to add and remove elements from both the ends
import java.util.*;

class Arraydeque {
  public static void main(String args[]) {
    ArrayDeque<Integer> q = new ArrayDeque<>();
    q.add(100);
    q.add(200);
    q.add(1300);
    // addFirst and last throws exception
    q.addLast(1900);
    q.addFirst(12000);

    // offerFirst() and offerLast()-> doesnt throw exception
    q.offerFirst(1);
    q.offerLast(2);

    // removeFirst() and removeLast()->throw exception
    // pollFirst and pollLast() ->doesnt throw exception
    q.pollFirst();
    q.pollLast();
    // getFirst() and getLast()->throws exception
    // peekFirst() and peekLast()->doesnt throw exception
    System.out.println(q.peekFirst());
    System.out.println(q.peekLast());
    System.out.println(q);
    System.out.println(q.getFirst());
    System.out.println(q.getLast());
  }
}