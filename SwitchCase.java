
//switch case used when we have to make a choice between multiple alternatives for a given variable
import java.util.Scanner;

class SwitchCase {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    // switch (age) {
    // case 18:
    // System.out.println("you are now a adult");
    // break;
    // case 23:
    // System.out.println("yu are now a young adult");
    // break;
    // case 60:
    // System.out.println("now you are a budda");
    // break;
    // default:
    // System.out.println("enjoy!");
    // switch (age) {
    // case "r":
    // System.out.println("you are now a adult");
    // break;
    // case "k":
    // System.out.println("yu are now a young adult");
    // break;
    // case "l":
    // System.out.println("now you are a budda");
    // break;
    // default:
    // System.out.println("enjoy!");

    // }
    // System.out.println("thanks");
    switch (age) {

      case 18 -> System.out.println("18");
      case 19 -> System.out.println("19");
      default -> System.out.println("different");

    }
  }
}