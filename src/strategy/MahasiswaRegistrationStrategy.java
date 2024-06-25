package strategy;

import controller.DatabaseController;
import controller.NavigationController;
import model.Mahasiswa;
import view.main.RegistFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class MahasiswaRegistrationStrategy implements RegistrationStrategy {

    private DatabaseController akunController;

    public MahasiswaRegistrationStrategy() {
        this.akunController = new DatabaseController();
    }

    @Override
    public void register(Mahasiswa mhs, RegistFrame frame) {
        if (validateMahasiswa(mhs, frame)) {
            try {
                akunController.insertMahasiswa(mhs);
                JOptionPane.showMessageDialog(frame, "Akun mahasiswa berhasil dibuat.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                NavigationController.getInstance().showLoginFrame(frame);  // Pass the current frame to close it
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(frame, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Terjadi kesalahan", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean validateMahasiswa(Mahasiswa mhs, RegistFrame frame) {
        // Implementasi validasi mahasiswa
        // Check if any field is empty
        if (mhs.getNim().isEmpty() || mhs.getNama().isEmpty() || mhs.getKelas().isEmpty() || mhs.getPassword().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Semua field harus diisi.", "Validasi Gagal", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if nim is numeric
        if (!mhs.getNim().matches("\\d+")) {
            JOptionPane.showMessageDialog(frame, "NIM harus berupa angka.", "Validasi Gagal", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate password
        String password = mhs.getPassword();
        if (password.length() < 8
                || !password.matches(".*[A-Z].*")
                || !password.matches(".*[a-z].*")
                || !password.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(frame, "Password harus minimal 8 karakter dan mengandung setidaknya satu huruf besar, satu huruf kecil, dan satu angka.", "Validasi Gagal", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Additional validation logic can be added here
        return true;
    }
}
