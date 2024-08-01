class FinallyBlock1 {
  public static void main(String args[]) {
    int a = 7;
    int b = 9;
    while (true) {
      try {
        System.out.println(a / b);
      } catch (Exception e) {
        System.out.println(e);
        break;
      } finally {
        System.out.println("IAM FINALLY FOR THE VALUE OF B=" + b);
      }
      b--;
    }
    try {
      System.out.println(50/10);
    } finally {
      System.out.println("yes iam finally");
    }
  }

}
