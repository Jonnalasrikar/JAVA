
/*
we can write our custom exceptions using exception class in java
exception class is a class which is used to create user defined exceptions
exception class conatians following important methods:
1.String toString()->executed when sout(e) is ran
2.String getMessage()->prints the exception methhods
3.void printStackTrace()->prints the stack trace of the exception

throw keyword is used to throw an exception expliictly by the programmer
*/
import java.util.Scanner;

class ExceptionClassinJava {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value=");
    int a = sc.nextInt();
    if (a < 99) {
      try {
        // throw new MyException();
        throw new ArithmeticException("Iam an arithemetic exception");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println(e. toString());
        System.out.println(e);
        e.printStackTrace();
        System.out.println("finished");

      }

    }
  }
}

class MyException extends Exception {
  @Override
  public String toString() {
    return "iam a tostring method";
  }

  public String getMessage() {
    return "I am a getMessage method";
  }
}