import java.util.*;

class PracticeSet {
  public static void main(String args[]) {
    // problem1
    // syntax error int a=7
    // logical error
    // int age=78;
    // int yearborn=2000-78;

    /*
     * problem2
     * {
     * try {
     * int a = 666 /0;
     * } catch (ArithmeticException e) {
     * System.out.println("hahaha");
     * } catch (IllegalArgumentException e) {
     * System.out.println("hehehe");
     * }
     * }
     */

    // problem 3
    boolean flag = true;
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Scanner sc = new Scanner(System.in);
    int i = 0;
    while (flag && i < 5) {
      try {
        System.out.println("enter the index=");
        int ind = sc.nextInt();
        System.out.println("the element is " + a[ind]);
        i++;
      } catch (Exception e) {
        System.out.println(e);
        flag = false;
      }
    }

  }
}