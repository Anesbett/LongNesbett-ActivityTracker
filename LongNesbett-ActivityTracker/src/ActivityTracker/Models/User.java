package ActivityTracker.Models;

import ActivityTracker.ActivityTracker;

public class User {

    // Define all user stat variables for the default model
    private Integer userAge = 21;
    private Integer userWeight = 150;
    private Integer userHeight = 66;
    private Integer stepsTaken = 5475;
    private String userGoal = "I want to run a mile in under 9 minuets";
    private Integer userHeartRate = 65;
    private Clock userTime;

    /**
     * Method that returns the users time
     * @return users time of type String
     */
    public Clock getUsersTime() {
        // user Clock methods to get current time
        return userTime;
    }

    /**
     * Method that returns the users age
     * @return  the current users age as an Integer
     */
    public Integer getUsersAge() {
        return userAge;
    }

    /**
     * Method that sets the current users age to a given value
     * @param  age the current users age
     */
    public void setUsersAge(Integer age) { this.userAge = age; }


    /**
     * Method that returns the users weight
     * @return  the current users weight as an Integer
     */
    public Integer getUsersWeight() {
        return userWeight;
    }

    /**
     * Method that sets the current users weight to a given value
     * @param  weight  the current users weight
     */
    public void setUsersWeight(Integer weight) {
        this.userWeight = weight;
    }

    /**
     * Method that returns the users height
     * @return  the current users height as an Integer
     */
    public Integer getUsersHeight() {
        return userHeight;
    }

    /**
     * Method that sets the current users weight to a given value
     * @param  height  the current users weight
     */
    public void setUsersHeight(Integer height) {
        this.userHeight = height;
    }

    /**
     * Method that returns the users fitness goal
     * @return users name of type String
     */
    public String getUsersGoal() {
        return userGoal;
    }

    /**
     * Method that takes in a string value and sets it as the current users name
     * @param  goal  the current users weight
     */
    public void setUsersGoal(String goal) {
        this.userGoal = goal;
    }

    /**
     * Method that returns the number of steps taken
     * @return  the current users step count as an Integer
     */
    public Integer getUsersStepCount() {
        return stepsTaken;
    }

    /**
     * Method that sets the current users step count
     * @param  stepsTaken  the current users step count
     */
    public void setUsersStepCount(Integer stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    /**
     * Helper method that returns the age factor that affects amount of calories burned
     * @return age factor for user's current age
     */
    private double calcAgeFactor(int userAge){
        if(userAge <= 10){
            return .5;
        }
        else if (userAge >= 11 && userAge <= 20 ){
            return .51;
        }
        else if (userAge >= 21 && userAge <= 30 ){
            return .52;
        }
        else if (userAge >= 31 && userAge <= 50 ){
            return .55;
        }
        else if (userAge >= 31 && userAge <= 40 ){
            return .56;
        }
        else if (userAge >= 41 && userAge <= 50 ){
            return .57;
        }
        else if (userAge >= 51 && userAge <= 60 ){
            return .58;
        }
        else {
            return .60;
        }
    }

    /**
     * Method that returns the number of calorie count taken
     * @return  the current users calorie count
     */
    public Double getUsersCalorieCount(String stepsTaken) {
        int weightTemp = ActivityTracker.user.getUsersWeight();
        double ageFactor = calcAgeFactor(ActivityTracker.user.getUsersAge());
        //calculate average steps per mile
        double calPerMile = weightTemp * ageFactor;
        //2200 steps is based off of national average for amount of steps taken per mile
        //** calculate calories burned per step
        double calPerStep = calPerMile/2200;
        //total calories burned
        double calories = calPerStep * ActivityTracker.user.getUsersStepCount();
        calories = Math.round(calories);
        return calories;
    }

    public void setHeartRate(int heartRate){
        this.userHeartRate = heartRate;
    }

    public Integer getHeartRate(){ return this.userHeartRate; }

}




