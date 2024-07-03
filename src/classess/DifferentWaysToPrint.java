class DifferentWaysToPrint {
  public static void main(String args[]) {
    System.out.print("srikar");
    System.out.println("jonnala");
    int a = 6;
    float b = 7.3942f;
    System.out.printf("the values of a and b are % d and %8.2f", a, b);
    System.out.format("the values of a and b are % d and %f", a, b);
  }
}