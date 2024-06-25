package controller;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import factory.ValidatorFactory;
import strategy.LoginStrategy;
import utility.LoginValidator;

public class LoginController {

    private ValidatorFactory validatorFactory;
    private LoginValidator loginValidator;

    public LoginController() {
        validatorFactory = new ValidatorFactory();
        loginValidator = new LoginValidator();
    }

    public void login(String nim, String password, JFrame loginFrame) {
        if (!loginValidator.isValidUser(nim, password)) {
            System.out.println(nim);
            JOptionPane.showMessageDialog(loginFrame, "NIM atau password tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LoginStrategy loginStrategy = validatorFactory.getLoginStrategy(nim);
        loginStrategy.login(nim, password, loginFrame);
    }
}
