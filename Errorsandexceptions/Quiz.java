import java.util.Scanner;

class Quiz {
  public static void main(String args[]) 
  {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    while (flag) 
    {
      System.out.println("enter the index=");
      int ind = sc.nextInt();
      try 
        {
          try 
          {
            System.out.println("you are in nestedt try block");
            System.out.println(a[ind]);
            flag = false;
          } catch (ArrayIndexOutOfBoundsException e) 
            {
              System.out.println("there is no index exist");
            }
      } 
      catch (Exception e) 
      {
        System.out.println("Exception occured is " + e);
      }
    }
    System.out.println("Thanks for using this code");

  }
}