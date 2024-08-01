/*
create a class game which allows a user to play "guess the no" name once Game should have following methods:
1.constructor to generate the random no
2.take user input
3.iscorrectno() detect whether the no entered by user is correct or not
use properties such as noof guesses
*/
import java.util.*;
class Excercise3
  {
    public static void main(String args[])
    {
      Game g=new Game();
      g.takeUserInput();
    }
  }
class Game
  {
    public int number;
    int inputnumber;
    int noOfGussess;
    public void setnoOfGussess(int noOfGussess)
    {
      this.noOfGussess=noOfGussess;
    }
    public int getnoOfGussess()
    {
      return noOfGussess;
    }
    void Game()
    {
      Random rand=new Random();
      this.number=rand.nextInt(100);
    }
    void takeUserInput()
    {
      System.out.println("guess the no");
      Scanner sc=new Scanner(System.in);
      inputnumber=sc.nextInt();
    }
    boolean isCorrectNo(int num)
    {
      if(num==number)
      {
        return true;
      }
      else if(num<)
      {
        return false;
      }
    }
    
  }
