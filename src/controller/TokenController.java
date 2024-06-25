package controller;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.SQLException;

public class TokenController {

    private static TokenController instance;
    private DatabaseController dbController;

    private TokenController() {
        dbController = new DatabaseController();
    }

    public static TokenController getInstance() {
        if (instance == null) {
            instance = new TokenController();
        }
        return instance;
    }

    public void verifyToken(String inputToken, JFrame currentFrame, NavigationController navigationController) {
        String correctToken = "UASPBO2024";
        String nim = SessionController.getInstance().getCurrentUser();

        if (nim == null) {
            JOptionPane.showMessageDialog(currentFrame, "Anda belum login.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (inputToken.equals(correctToken)) {
            try {
                dbController.updateStatus(nim, 1);
                JOptionPane.showMessageDialog(currentFrame, "Token benar, ujian dimulai.");
                navigationController.showSoalUjian(currentFrame);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(currentFrame, "Terjadi kesalahan pada database.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(currentFrame, "Token salah.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
