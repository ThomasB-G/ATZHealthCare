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
    private HomePage home;
    private ModelUsers model;

    public ControllerUsers() {
        this.loginView = new LoginView(this);
        this.registerView = new RegisterView(this);
        this.home = new HomePage(this);
        this.model = new ModelUsers(this);
        this.loginView.setVisible(true);
    }
    
    public void toRegisterButtonPushed()
    {
        this.loginView.dispose();
        this.registerView.setVisible(true);
    }
    
    public void toDocumentButtonPushed()
    {
        this.registerView.dispose();
        
        Documents.ControllerDocs nextCntl = new Documents.ControllerDocs();
    }
    
    public void toLogin(){
        this.home.dispose();
        this.loginView.setVisible(true);
    }
    
    public void toHome(){
        this.registerView.dispose();
        this.home.setVisible(true);
    }
}
