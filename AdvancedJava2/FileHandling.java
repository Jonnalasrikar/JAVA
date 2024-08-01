import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
Reading from and writing to files is an importatnt aspect of any programming language
we can use the file class in java to create a file object
CreateNewFile() method is used to create a new file


*/

class FileHandling {
  public static void main(String args[]) {
    /*
     * code to create a new file
     * File myfile = new File("myfile.txt");
     * try
     * {
     * myfile.createNewFile();
     * } catch (Exception e)
     * {
     * System.out.println("unable to create file");
     * System.out.println(e);
     * }
     */
    /*
     * code to write to a file
     * try {
     * FileWriter filewriter = new FileWriter("myfile.txt");
     * filewriter.
     * write("this is the our first file form this java course\nokay now by");
     * filewriter.close();
     * } catch (Exception e) {
     * System.out.println(e);
     * }
     */

    /* reading a file
    for reading files we can use the same scanner class and supply the file object
    File myfile = new File("myfile.txt");
    try {
      Scanner sc = new Scanner(myfile);
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        System.out.println(line);
      }
      sc.close();
    } catch (Exception e) {
      System.out.println(e);
    }*/

    /*deleting a file
    To delete a file we can use the delete() method of the file class
    File Myfile=new File("myfile.txt");
    if(Myfile.delete())
    {
      System.out.println("this file is deleted"+Myfile.getName());
    }
    else
    {
      System.out.println("some error has been occured");
    }*/

  }
}