package ActivityTracker.Models;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Clock {

    //Private variable for the clock class
    private String time;

    //formatter
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm");
    LocalDateTime nowTime = LocalDateTime.now();


    /**
     * Method that returns the current system time
     * @return system time of type string
     */
    public String getTime(){
        time = timeFormatter.format(nowTime);
        return time;
    }
}
