class PracticeQuestionsOnJavaMethods {
  public static void main(String args[]) {
    // multiplication(5);
    // pattern(4);
    // System.out.println(sum(10));
    // pattern(4);
    // System.out.println(fib(5));
    System.out.println(average(7, 8, 9, 4, 5, 6, 1, 2, 3));
  }

  public static double average(int... arr) {
    int sum = 0;
    for (int a : arr) {
      sum = sum + a;
    }
    return sum / arr.length;
  }

  // public static int fib(int n) {
  // if (n == 0 || n == 1) {
  // return n;
  // }
  // return fib(n - 1) + fib(n - 2);
  // }

  // public static void pattern(int n) {
  // for (int i = n; i > 0; i--) {
  // for (int j = 0; j < i; j++) {
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // }

  // public static int sum(int n) {
  // if (n == 1) {
  // return 1;
  // }
  // return n + sum(n - 1);
  // }

  // public static void pattern(int n) {
  // for (int i = 1; i <= n; i++) {
  // for (int j = 0; j < i; j++) {
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // }

  // public static void multiplication(int n) {
  // for (int i = 1; i <= 10; i++) {
  // System.out.println(n + "*" + i + "=" + n * i);
  // }
  // }
}