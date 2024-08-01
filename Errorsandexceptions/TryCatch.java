/*exception is an event that occurs during the execution of a program that disrupts the normal flow of the program.
1.checked exeption->compile time error(handled by compiler)
2.unchecked exeption->runtime error
commonly occuring exceptions:
null poitner exception
array out of bound exception
arithmetic exception
illegal argument exception
number format exception
*/
class TryCatch {
  public static void main(String args[]) {
    int a = 60000;
    int b = 0;
    try {
      int c = a / b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println("We are catching the exception");
      System.out.println(e);
    }
    System.out.println("hello how are you");
  }
}