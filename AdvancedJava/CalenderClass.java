
/*
Calender class is a abstract class object cannot be created
*/
import java.util.Calendar;

class calenderclass {
  public static void main(String args[]) {
    // Calendar c = Calendar.getInstance();
    // System.out.println(c.getCalendarType());
    // System.out.println(c.getTimeZone());

    Calendar c = Calendar.getInstance();
    System.out.println(c.getCalendarType());
    System.out.println(c.getTimeZone());
    System.out.println(c.getTime());
  }
}