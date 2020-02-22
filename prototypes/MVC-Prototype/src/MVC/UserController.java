package MVC;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name){
        model.setName(name);
    }

    public String getUserName(){
        return model.getName();
    }

    public void setUserWeight(String weight){
        model.setWeightNo(weight);
    }

    public String getUserWeight(){
        return model.getWeightNo();
    }

    public void updateView(){
        view.printUserDetails(model.getName(), model.getWeightNo());
    }
}
