/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

/**
 *
 * @author russell
 */
public class ControllerUsers {
    private LoginView loginView;
    private RegisterView registerView;
    private ModelUsers model;

    public ControllerUsers() {
        this.loginView = new LoginView(this);
        this.registerView = new RegisterView(this);
        this.model = new ModelUsers(this);
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public RegisterView getRegisterView() {
        return registerView;
    }

    public void setRegisterView(RegisterView registerView) {
        this.registerView = registerView;
    }

    public ModelUsers getModel() {
        return model;
    }

    public void setModel(ModelUsers model) {
        this.model = model;
    }
    
    
    
    
}
