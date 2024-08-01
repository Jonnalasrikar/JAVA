import java.util.*;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Practiceset {
  public static void main(String args[]) {
    /*
     * ps question1:
     * ArrayList<String> arr = new ArrayList<>();
     * arr.add("student1");
     * arr.add("student2");
     * arr.add("student3");
     * arr.add("student4");
     * arr.add("student5");
     * arr.add("student6");
     * arr.add("student7");
     * arr.add("student8");
     * arr.add("student9");
     * arr.add("student10");
     * for (Object i : arr) {
     * System.out.println(i);
     * }
     */

    /*
     * ps question 5
     * Set<Integer> s = new HashSet<>();
     * s.add(5);
     * s.add(6);
     * s.add(7);
     * s.add(8);
     * s.add(9);
     * s.add(6);
     * s.add(7);
     * System.out.println(s);
     */
    // ps question 2,3,4
    Date d = new Date();
    System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    Calendar c = Calendar.getInstance();
    // System.out.println(c.getTime());
    System.out.println(c.get(c.HOUR) + ":" + c.get(c.MINUTE) + ":" + c.get(c.SECOND));
    LocalDateTime d1 = LocalDateTime.now();
    System.out.println(d);
    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s:a");
    ;
    String date = d1.format(df);
    System.out.println(date);

  }
}