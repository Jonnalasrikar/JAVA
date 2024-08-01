/*
user defined exceptions can be thrown by using throw new Myexceptioname
throw-throw is used to throw an exception expliictly by the programmer
throws-throws is used to declare a method that throws an exception
->in java throws is used to declare an exception this gives an information to the programmer that there might be an exception so it is better to be prepared with try catch block
*/

import java.util.*;

class ThrowvsThrows {
  public static int divide(int a, int b) throws ArithmeticException {
    // made by harry bhai
    return a / b;
  }

  public static double area(int r) throws NegativeRadiusException {
    if (r < 0) {
      throw new NegativeRadiusException();
    }
    return Math.PI * r * r;
  }

  public static void main(String args[]) {
    // shashank-uses divide function created by harry bhai
    try {
      // int c = divide(20, 0);
      // System.out.println(c);
      double d = area(11);
      System.out.println(d);
    } catch (Exception e)

    {
      System.out.println(e.getMessage());
      System.out.println(e.toString());
      System.out.println("Exception");
    }

  }
}

class NegativeRadiusException extends Exception {
  @Override
  public String getMessage() {
    return "Radius cannot be negative";
  }

  public String toString() {
    return "Radius cannot be negative";
  }
}
