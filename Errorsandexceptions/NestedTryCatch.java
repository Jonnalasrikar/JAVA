import java.util.Scanner;

class NestedTryCatch {
  public static void main(String args[]) {
    int a[] = new int[3];
    a[0] = 0;
    a[1] = 2;
    a[2] = 3;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of the index");
    int ind = sc.nextInt();
    try {
      System.out.println("welcome to nessted try catch");
      try {
        System.out.println(a[ind]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Sorry this index doesnt exist");
        System.out.println("exception in level 2");
      }

    } catch (Exception e) {
      System.out.println("exception in level 1" + e);
    }
  }
}