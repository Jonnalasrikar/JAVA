class IncrementDecrement {
  public static void main(String args[]) {
    int a = 5;
    int b = a++;// intially asigns value to it and increments the value at a
    System.out.println(a++);// first prints and increments
    System.out.println(a);
    System.out.println(++a);
    System.out.println(a--);
    System.out.println(a);
    System.out.println(--a);
    System.out.println(b);
    int y = 7;
    int x = ++y * 8;
    System.out.println(x);
    char m = 'a';
    System.out.println(++m);

  }
}