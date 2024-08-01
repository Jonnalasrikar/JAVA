//f(x)=x%10;-> returns the index
//hashset
//hashmap
//Linkedhashmap
//hashtable
import java.util.*;
class Hashset
  {
    public static void main(String args[])
    {
      HashSet<Integer> hs=new HashSet<Integer>();
      hs.add(10);
      hs.add(20);
      hs.add(20);
      hs.add(30);
      System.out.println(hs);
    }
  }