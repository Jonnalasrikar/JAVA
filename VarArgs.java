//varargs is a special type of parameter that allows a method to accept a variable number of arguments.
class VarArgs {
  // static int sum(int a, int b) {
  // return a + b;
  // }

  // static int sum(int a, int b, int c) {
  // return a + b + c;
  // }
  // static int sum(int... arr) {
  // // availabe as int arr[]
  // int sum = 0;
  // for (int a : arr) {
  // sum = sum + a;
  // }
  // return sum;
  // }
  //you need to give atleast one argument
  static int sum(int x, int... arr) {
    // availabe as int arr[]
    int sum = x;
    for (int a : arr) {
      sum = sum + a;
    }
    return sum;
  }

  public static void main(String args[]) {
    System.out.println("welcome to var args tuorial");

    System.out.println(sum(5, 6));
    System.out.println(sum(5, 6, 7));
    System.out.println(sum(5, 6, 71, 3, 9, 5));
    System.out.println(sum(5));

  }
}