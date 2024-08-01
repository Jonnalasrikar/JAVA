import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class AdvancedJavaPracticeset {
  @SuppressWarnings("deprecation")
  public static void main(String args[]) {
    // create java doc without using intellij idea

    // 2-create a method with deprecated
    // mydeprectaed d = new mydeprectaed();
    // d.meth1();

    /*
     * create interface and generate a instance from it
     * sri s = new sri() {
     * public void speak() {
     * System.out.println("hello!!!!!!");
     * }
     * 
     * public void run() {
     * System.out.println("runn!!");
     * }
     * };
     * s.speak();
     */

    // write a program to generate multiplication of a given number and write it to
    // a file
    // File myfile = new File("Multiplcation.txt");
    // try {
    // myfile.createNewFile();
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    int a = 5;
    String table = "";
    for (int i = 1; i <= 10; i++) {
      table = table + a + "X" + i + "=" + a * i + "\n";
    }
    try {
      FileWriter filewriter = new FileWriter("Multiplcation3.txt");
      filewriter.write(table);
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

/*
 * class mydeprectaed {
 * 
 * @Deprecated
 * public void meth1() {
 * System.out.println("iama a meth1");
 * }
 * }
 */
/*
 * interface sri {
 * void speak();
 * 
 * void run();
 * 
 * }
 */