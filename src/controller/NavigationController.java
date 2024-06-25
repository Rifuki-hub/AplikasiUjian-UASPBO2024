package controller;

import javax.swing.JFrame;
import view.admin.HasilUjian;
import view.main.LoginFrame;
import view.main.RegistFrame;
import view.user.SoalUjian;
import view.user.TokenMenu;
import view.user.UserMenu;

public class NavigationController {
    private static NavigationController instance;

    private NavigationController() {}

    public static NavigationController getInstance() {
        if (instance == null) {
            instance = new NavigationController();
        }
        return instance;
    }

    public void showLoginFrame(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setLocationRelativeTo(null); // Pusatkan jendela
        loginFrame.setVisible(true);
    }

    public void showRegistFrame(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        RegistFrame registFrame = new RegistFrame();
        registFrame.setLocationRelativeTo(null); // Pusatkan jendela
        registFrame.setVisible(true);
    }

    public void showUserMenu(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        UserMenu userMenu = new UserMenu();
        userMenu.setLocationRelativeTo(null); // Pusatkan jendela
        userMenu.setVisible(true);
    }

    public void showHasilUjian(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        HasilUjian hasilUjian = new HasilUjian();
        hasilUjian.setLocationRelativeTo(null); // Pusatkan jendela
        hasilUjian.setVisible(true);
    }

    public void showTokenMenu(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        TokenMenu tokenMenu = new TokenMenu();
        tokenMenu.setLocationRelativeTo(null); // Pusatkan jendela
        tokenMenu.setVisible(true);
    }

    public void showSoalUjian(JFrame currentFrame) {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }
        SoalUjian soalUjian = new SoalUjian();
        soalUjian.setLocationRelativeTo(null); // Pusatkan jendela
        soalUjian.setVisible(true);
    }
}
