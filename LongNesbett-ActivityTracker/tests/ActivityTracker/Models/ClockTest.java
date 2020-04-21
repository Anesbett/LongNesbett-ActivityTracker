package ActivityTracker.Models;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    private Clock clock = new Clock();
    private DateTimeFormatter testTimeFormatter = DateTimeFormatter.ofPattern("h:mm");
    private LocalDateTime testNowTime = LocalDateTime.now();
    public String testTime = testTimeFormatter.format(testNowTime);

    /**
     * This functon tests the getTime funciton.
     * The test will pass if the method returns the systems local time
     */
    @Test
    void getTime() {
        assertEquals(testTime, clock.getTime());
    }

    /**
     * This test checks if the add one function works.
     * @expected current local time + 1 minute
     */
    @Test
    void addOne() {
        testNowTime = testNowTime.plusMinutes(1);
        testTime = testTimeFormatter.format(testNowTime);
        assertEquals(testTime, clock.addOne());
    }

    /**
     * This test checks if the minuesOne function works
     * @expected current local time - 1 minute
     */
    @Test
    void minusOne() {
        testNowTime = testNowTime.minusMinutes(1);
        testTime = testTimeFormatter.format(testNowTime);
        assertEquals(testTime, clock.minusOne());
    }
}