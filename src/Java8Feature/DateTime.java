package Java8Feature;
import java.time.*;

/*Existing Date and Time APIs in Java were not thread-safe, there was a lack of consistency as java.util and java.sql both packages define Date class,
and it didn't have support for timezone, so developers had to write an additional logic for timezone and thread-safety.
Java 8 introduced java.time package

Today's Date - 2023-07-16
DateAndTimeFormat - 2023-07-16T14:36:17.925201375

*/

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*LocalDate CurrentDate = LocalDate.now(); // LocalDate.now() returns System’s Date
        System.out.println("Today's Date - "+CurrentDate);// Printing today's date
        
        LocalTime todaysTime = LocalTime.now(); // LocalTime.now() returns the current time
        System.out.println("Time - Hours: "+todaysTime.getHour()+"\t Minutes: "+todaysTime.getMinute()); // printing hours and minutes
        
        LocalDateTime date_Time = LocalDateTime.parse(LocalDate.now().plusDays(1)+"T09:45:00"); // LocalDateTime stores date(here, after adding 1) and time 
        System.out.println("Tomorrow's Date and Time - "+date_Time+", Day - "+ date_Time.getDayOfWeek()); // printing Tomorrow's Date and Time
        
        // We can also use Time zone-specific Date/Time
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date_Time,londonZone);*/
   
	}

}
