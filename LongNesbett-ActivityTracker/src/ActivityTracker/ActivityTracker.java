package ActivityTracker;

public class ActivityTracker {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        User model  = retriveUserInformation();

        //Create a view : to write student details on console
        HomeView view = new HomeView();

        HomeController controller = new HomeController(model, view);

        controller.updateView();

        //update model data
        //controller.setUsersName("John");

        //controller.updateView();
    }

    private static User retriveUserInformation(){
        User user = new User();
        user.setUsersName("Robert");
        user.setUsersAge(27);
        user.setUsersWeight(225);
        user.setUsersHeight(78);
        user.setUsersGoal("I want to loose all of my fat.");
        return user;
    }
}