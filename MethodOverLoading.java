
//void is used to return nothing
//static keyword- used to declare a method as static which means associate a method of a class with the class rather than the object .static method in a class is shared by all the objects of that class.
import java.util.*;

// class MethodOverLoading {
//   public static void main(String args[]) {
//     case 1:changing the integer
//     telljoke();
//     int x = 45;
//     change(x);
//     //System.out.println("after changing" + x);
//     int marks[] = { 77, 88, 99, 44, 55 };

//     case 2:chaning the array 
//     int a[] = { 99, 98, 97, 96 };
//     change2(a);
//     System.out.println(Arrays.toString(a));
//   }

//   public static void change2(int a[]) {
//     a[0] = 1000;
//   }

//   public static void change(int a) {
//   a = 98;
//   }

//   public static void telljoke() {
//   System.out.println("you are fool");
//   }
// }
//arguments
//parameters-a,b-gives the values
class MethodOverLoading {
  public static void main(String args[]) {
    foo();
    foo(3);
    foo(4, 5);//arguments are actual
  }

  static void foo() {
    System.out.println("hello srikar");
  }

  static void foo(int a) {
    System.out.println("good morning" + a);
  }

  static void foo(int a, int b) {
    System.out.println("good morning" + a + b);
  }
}