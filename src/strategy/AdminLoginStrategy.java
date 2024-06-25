package strategy;

import controller.NavigationController;
import controller.SessionController;
import model.Admin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminLoginStrategy implements LoginStrategy {
     Admin admin = new Admin();
     
    @Override
    public void login(String nim, String password, JFrame frame) {

        if (nim.equals(admin.getNim()) && password.equals(admin.getPassword())) {
            SessionController.getInstance().login(nim);
            JOptionPane.showMessageDialog(frame, "Admin berhasil masuk.", "Admin Masuk", JOptionPane.INFORMATION_MESSAGE);
            NavigationController.getInstance().showHasilUjian(frame);
        } else {
            JOptionPane.showMessageDialog(frame, "NIM atau password admin salah.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
