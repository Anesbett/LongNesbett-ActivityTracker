package ActivityTracker;

import ActivityTracker.Controllers.HomeController;
import ActivityTracker.Models.User;
import ActivityTracker.Views.HomeView;

public class ActivityTracker {
    public static void main(String[] args) {

        // Retrieve users stats based on values assigned
        User model  = retriveUserInformation();

        // Create a view to write user details on scene
        HomeView view = new HomeView();

        HomeController controller = new HomeController(model, view);

        // The controllers view must be updated in order to reflect the changes
        controller.updateView();

        // Update the models data
        //controller.setUsersName("John");

        //controller.updateView();
    }


    /**
     * This functon assigns values to the users in order to show the flow of our MVC Pattern
     * @return  User  the function returns an object User with the assigned values
     */
    private static User retriveUserInformation(){
        User user = new User();
        user.setUsersName("Robert");
        user.setUsersAge(27);
        user.setUsersWeight(225);
        user.setUsersHeight(78);
        user.setUsersGoal("I want to stop being a fat boy.");
        return user;
    }
}