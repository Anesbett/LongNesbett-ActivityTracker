package ActivityTracker.Models;

import ActivityTracker.ActivityTracker;

public class User {

    // Define all user stat variables for the model
    private String userName;
    private Integer userAge = 21;
    private Integer userWeight = 150;
    private Integer userHeight = 7;
    private String userGoal;
    //private Integer stepsTaken;
    //private Integer caloriesBurned;

    /**
     * Method that returns the users name
     * @return users name of type String
     */
    public String getUsersName() {
        return userName;
    }

    /**
     * Method that takes in a string value and sets it as the current users name
     * @param  name  the current users weight
     */
    public void setUsersName(String name) {
        this.userName = name;
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
    public void setUsersAge(Integer age) {
        this.userAge = age;
    }

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
}
