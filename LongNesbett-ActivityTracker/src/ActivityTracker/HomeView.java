package ActivityTracker;

public class HomeView {
    public void printUserDetails(String userName, Integer userAge, Integer userWeight, Integer userHeight, String userGoal){
        System.out.println("Name: " + userName);
        System.out.println("User Age: " + userAge);
        System.out.println("User Weight: " + userWeight);
        System.out.println("User Height: " + userHeight + " inches");
        System.out.println("User Goal: " + userGoal);
    }
}