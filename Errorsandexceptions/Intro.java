
/*error-galti
No matter how smart you are errors are our constant companion with practice we keep getting better at finding and correcting them

there are three types of error:
1.syntax error
2.logical errors
3.runtime errors-called as exception

1.syntax errors:when compiler finds something wrong with our program it throws a syntax error
int a=5-> no semicolon
a=a+3;
d=4;->d is not declared

2.logical errors:A logical error or a bug occurs when a program complies and runs but does the wrong thing//
ex:message delivered wrongly
incorrect redirects

3.runtime errors:java may sometime encounter an error while the program is running those are called runtime errors
they are encountered due to circumstances like bad input and resource constaraints 

syntax and logical errors are encountered by the compiler while runtime errors are encountered by the java runtime environment
syntax and logical errors are encountered by the program whereas runtim errors are encountered by the user
*/
import java.util.Scanner;

class Intro {
  public static void main(String args[]) {
    /*
     * syntax error
     * int a = 5;
     * b = 7;
     * System.out.println(a + c);
     */
    /*
     * logical errors demo
     * write a prime to print all prime numbers between 1 to 10
     * System.out.println(2);
     * for (int i = 0; i < 5; i++) {
     * System.out.println(2 * i + 1);
     * }
     */

    /* runtime errors
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a + b);
    System.out.println(1000 / a);*/

  }
}