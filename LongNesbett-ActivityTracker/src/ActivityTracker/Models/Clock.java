package ActivityTracker.Models;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Clock {

    //formatter
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm");
    LocalDateTime nowTime = LocalDateTime.now();

    //Private variable for the clock class
    public String time = timeFormatter.format(nowTime);
    public boolean bedTime;

    /**
     * Method that returns the current system time
     * @return system time of type string
     */
    public String getTime(){
        return time;
    }

    public String addOne(){
        nowTime = nowTime.plusMinutes(1);
        time = timeFormatter.format(nowTime);
        return getTime();
    }
    public String minusOne(){
        nowTime = nowTime.minusMinutes(1);
        time = timeFormatter.format(nowTime);
        return getTime();
    }

    public boolean isBedTime(){
        ZoneId z = ZoneId.of( "America/Montreal" );
        ZonedDateTime zdt = ZonedDateTime.now( z );
        LocalTime lt = zdt.toLocalTime();
        LocalTime start = LocalTime.of( 20 , 0 );  // 8 PM.
        LocalTime stop = LocalTime.of( 8 , 0 );  // 8 AM.
        Boolean silentRunning = null ;
        if( start.equals( stop ) ) {
            silentRunning = Boolean.FALSE ;
        } else if( stop.isAfter( start ) ) {  // Example 3 PM to 6 PM.
            silentRunning = ( ! lt.isBefore( start ) ) && lt.isBefore( stop ) ;
        } else if ( stop.isBefore( start ) ) {  // Example 11 PM to 8 AM.
            silentRunning = ( lt.equals( start ) || lt.isAfter( start ) ) && lt.isBefore( stop ) ;
        } else {
            // Error. Should not reach this point. Paranoid check.
        }
        if (silentRunning == true){
            return false;
        }
        else { return true; }
    }
}
