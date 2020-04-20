package ActivityTracker.Models;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Clock {

    //formatter
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm");
    LocalDateTime nowTime = LocalDateTime.now();

    //Private variable for the clock class
    public String time = timeFormatter.format(nowTime);

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
}
