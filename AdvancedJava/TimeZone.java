
/*
Time zone class is used to create time zones in java.Some of the most important methods of TimeZone class are:
1.getAvaialableIDs()->returns an array of all the available time zones
2.getDefautl()->returns the default time zone
3.getID()->returns the ID of the time zone

*/
import java.util.*;

class Timezone {
  public static void main(String args[]) {
    System.out.println(TimeZone.getAvailableIDs());
    System.out.println(TimeZone.getDefault());
    // System.out.println(TimeZone.getID());
  }
}