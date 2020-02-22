package ActivityTracker.Views;

import ActivityTracker.ActivityTracker;

public class HomeView {

    // The view will be where we assign out users values to objects

    public void printUserDetails(String userName, Integer userAge, Integer userWeight, Integer userHeight, String userGoal){
        System.out.println("Name: " + userName);
        System.out.println("User Age: " + userAge);
        System.out.println("User Weight: " + userWeight);
        System.out.println("User Height: " + userHeight + " inches");
        System.out.println("User Goal: " + userGoal);
    }
}