
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class datetimeformatter {
  public static void main(String args[]) {
    LocalDateTime d = LocalDateTime.now();// this this the date
    System.out.println(d);

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy--E--a--H:m!!!!");// formmating the date
    String myDate = d.format(df);
    // creating date string using date and formatter
    System.out.println(myDate);
    DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
    String myDate2 = d.format(df2);
    System.out.println(myDate2);
  }
}