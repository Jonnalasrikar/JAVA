
/*
date and time in java->java.time->package for date and time in java from java 8 onwards
before java8 java.util package used to hold the date and time now thses classess are deprecated
how java stores dates?
date in java is stored in the form of a long number.this long no holds the no of milliseconds passed since 1 jan 1970
java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever we ask it for years passed
System.currentTimeMillis() returns the no of milliseconds passed since 1 jan 1970,we can calculate minutes,seconds,and years passed

is it safe to store the no of ms in a variable of type long?->yes
*/
// import java.Time;

class DateandTime {
  public static void main(String args[]) {
    // System.out.println(System.currentTimeMillis());
    System.out.println(System.currentTimeMillis() / 1000);
    System.out.println(System.currentTimeMillis() / 1000 / 86400 / 365);
    // System.out.println(System.currentTimeMillis() / 1000 / 86400);
    System.out.println(Long.MAX_VALUE);
    System.out.println(System.currentTimeMillis());

  }
}