
package strategy;

import controller.DatabaseController;
import controller.NavigationController;
import controller.SessionController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserLoginStrategy implements LoginStrategy {

    private DatabaseController akunController;

    public UserLoginStrategy() {
        akunController = new DatabaseController();
    }

    @Override
    public void login(String nim, String password, JFrame frame) {
        System.out.println(nim);
        System.out.println(password);
        try {
            boolean isValid = akunController.validateLogin(nim, password);
            if (isValid) {
                SessionController.getInstance().login(nim);
                JOptionPane.showMessageDialog(frame, "Login berhasil.", "Mahasiswa Masuk", JOptionPane.INFORMATION_MESSAGE);
                NavigationController.getInstance().showUserMenu(frame);
            } 
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Terjadi kesalahan saat login: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
