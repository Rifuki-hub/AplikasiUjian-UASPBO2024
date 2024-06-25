package utility;

import model.Admin;

public class LoginValidator {
    public boolean isValidUser(String nim, String password) {
        if (nim == "NIM" || password == "Pass") {
            return false;
        }
        if (nim.isEmpty() || password.isEmpty()) {
            return false;
        }
        return true;
    }
}
