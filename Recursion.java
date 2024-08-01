//fn calls itself
class Recursion {
  public static void main(String args[]) {
    System.out.println(factorial(7));
    System.out.println(factoriall(7));

  }

  static int factoriall(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      int product = 1;
      for (int i = n; i > 0; i--) {
        product = product * i;
      }
      return product;
    }
  }
}