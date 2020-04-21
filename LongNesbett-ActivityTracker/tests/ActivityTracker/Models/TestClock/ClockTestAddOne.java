package ActivityTracker.Models.TestClock;

import ActivityTracker.Models.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class ClockTestAddOne {

    private Clock clock = new Clock();
    private DateTimeFormatter testTimeFormatter = DateTimeFormatter.ofPattern("h:mm");
    private LocalDateTime testNowTime = LocalDateTime.now();
    public String testTime = testTimeFormatter.format(testNowTime);

    /**
     * The before method adds one minute to test data each time before each method is called
     */
    @BeforeEach
    void beforeEach(){
        testNowTime = testNowTime.plusMinutes(1);
        testTime = testTimeFormatter.format(testNowTime);
    }

    /**
     * This function tests the addOne function of the Clock model.
     * The test will run 25 times and add 1 minute each time.
     * @expected current local time + 1 minute each method call
     */
    @RepeatedTest(25)
    void addOne() {
        assertEquals(testTime, clock.addOne());
    }
}