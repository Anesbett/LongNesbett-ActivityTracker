package ActivityTracker.Models.TestUser;

import ActivityTracker.Models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user = new User();

    /**
     * This test checks the getUsersAge function
     * @expected user's age is 25
     */
    @Test
    void getUsersAge() {
        user.setUsersAge(25);
        assertEquals(25, user.getUsersAge());
    }

    /**
     * This test checks the setUsersAge function
     * @expected user's age is set to 25
     */
    @Test
    void setUsersAge() {
        user.setUsersAge(25);
        assertEquals(25, user.getUsersAge());
    }

    /**
     * This test checks the getUsersWeight function
     * @expected user's weight is 150
     */
    @Test
    void getUsersWeight() {
        user.setUsersHeight(150);
        assertEquals(150, user.getUsersHeight());
    }

    /**
     * This test checks the setUsersWeight function
     * @expected user's weight is set to 125
     */
    @Test
    void setUsersWeight() {
        user.setUsersHeight(125);
        assertEquals(125, user.getUsersHeight());
    }

    /**
     * This test checks the getUsersHeight function
     * @expected user's weight is 60
     */
    @Test
    void getUsersHeight() {
        user.setUsersHeight(60);
        assertEquals(60, user.getUsersHeight());
    }

    /**
     * This test checks the setUsersHeight function
     * @expected user's height is set to 60
     */
    @Test
    void setUsersHeight() {
        user.setUsersHeight(60);
        assertEquals(60, user.getUsersHeight());
    }

    /**
     * This test checks the setUsersStepCount function
     * @expected user's step count is set to 100
     */
    @Test
    void setUsersStepCount(){
        user.setUsersStepCount(100);
        assertEquals(100, user.getUsersStepCount());
    }

    /**
     * This test checks the getUsersStepCount function
     * @expected user's step count is 2000
     */
    @Test
    void getUsersStepCount() {
        user.setUsersStepCount(2000);
        assertEquals(2000, user.getUsersStepCount());
    }

    /**
     * This test checks the getUsersCalorieCount function
     * @expected user's total calories burned is 194 based off of user's 5745 steps taken
     */
    @Test
    void getUsersCalorieCount(){
        assertEquals(194.0, user.getUsersCalorieCount("5745"));
    }
}