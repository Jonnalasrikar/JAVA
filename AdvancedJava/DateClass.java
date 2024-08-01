/*
we can aslo use construtcors provided by the DATE class
*/

import java.util.Date;

class DateClass {
  public static void main(String args[]) {
    Date d = new Date();
    System.out.println(d);
    System.out.println(d.getTime());
    System.out.println(d.getDate());
    System.out.println(d.getSeconds());
    System.out.println(d.getYear());
    System.out.println(d.getDay());
  }
}