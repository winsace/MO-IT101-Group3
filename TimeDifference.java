import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//Calculate time difference 
//Formula Time out - Time in = Total Time
//Total time must be converted to minutes
//Total minutes divide by 60 (as there is 60 minutes in 1 hour) to convert to decimal

public class TimeDifference {
  public static void main(String[] args) {
    LocalTime timeIn = LocalTime.of(8, 00);
    LocalTime timeOut = LocalTime.of(17, 00);
    long differenceInMinutes = ChronoUnit.MINUTES.between(timeIn, timeOut);
    double differenceInDecimal = (double) differenceInMinutes / 60;
    System.out.println("Time difference: " + differenceInMinutes + " minutes");
    System.out.println("Time difference: " + differenceInDecimal + " hours");
System.out.println("if lunch is unpaid -1 hour");
  }
}