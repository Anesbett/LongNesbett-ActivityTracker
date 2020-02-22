package ActivityTracker;

public class HomeController {
    private User model;
    private HomeView view;

    public HomeController(User model, HomeView view){
        this.model = model;
        this.view = view;
    }

    /**
     * Controller method that interacts with the model to set the users name
     */
    public void setUsersName(String name){
        model.setUsersName(name);
    }

    /**
     * Controller method that interacts with the model to retrieve the users name
     * @return  String  returns the users name
     */
    public String getUsersName(){
        return model.getUsersName();
    }

    /**
     * Controller method that interacts with the model to set the users age
     */
    public void setUsersAge(Integer age){
        model.setUsersAge(age);
    }

    /**
     * Controller method that interacts with the model to retrieve the users age
     * @return  Integer  returns the users age
     */
    public Integer getUsersAge(){
        return model.getUsersAge();
    }

    /**
     * Controller method that interacts with the model to set the users weight
     */
    public void setUsersWeight(Integer weight){
        model.setUsersWeight(weight);
    }

    /**
     * Controller method that interacts with the model to retrieve the users weight
     * @return  Integer  returns the users weight
     */
    public Integer getUsersWeight(){
        return model.getUsersWeight();
    }

    /**
     * Controller method that interacts with the model to set the users height
     */
    public void setUsersHeight(Integer height){
        model.setUsersHeight(height);
    }

    /**
     * Controller method that interacts with the model to retrieve the users height
     * @return  Integer  returns the users height
     */
    public Integer getUsersHeight(){
        return model.getUsersHeight();
    }

    /**
     * Controller method that interacts with the model to set the users goal
     */
    public void setUsersGoal(String goal){
        model.setUsersGoal(goal);
    }

    /**
     * Controller method that interacts with the model to retrieve the users goal
     * @return  String  returns the users goal
     */
    public String getUsersGoal(){
        return model.getUsersGoal();
    }

    /**
     * Controller method that passes the model information to the view
     */
    public void updateView(){
        view.printUserDetails(model.getUsersName(), model.getUsersAge(), model.getUsersWeight(), model.getUsersHeight(), model.getUsersGoal());
    }
}