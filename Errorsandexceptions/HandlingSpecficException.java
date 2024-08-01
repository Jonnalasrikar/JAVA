import java.util.*;

class HandlingSpecficException {
  public static void main(String args[]) {
    int a[] = new int[3];
    a[0] = 0;
    a[1] = 2;
    a[2] = 3;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array index");
    int index = sc.nextInt();
    System.out.println("enter the number you want to divide the value with");
    int val = sc.nextInt();
    try {
      System.out.println("the value at the index is " + a[index]);
      System.out.println(val / a[index]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("array IndexOutOfBoundsException occured");
      System.out.println(e);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException occured");
      System.out.println(e);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}