package controller;

import model.Database;
import model.Mahasiswa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatabaseController {

    private Database config;

    public DatabaseController() {
        this.config = Database.getInstance();
    }

    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        String sql = "INSERT INTO datauas (nim, nama, kelas, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = config.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getKelas());
            pstmt.setString(4, mahasiswa.getPassword());
            pstmt.executeUpdate();
        }
    }

    public List<Mahasiswa> getAllMahasiswa() throws SQLException {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String sql = "SELECT * FROM datauas";
        try (PreparedStatement pstmt = config.getConnection().prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setKelas(rs.getString("kelas"));
                mahasiswa.setPassword(rs.getString("password"));
                mahasiswa.setNilai(rs.getInt("nilai"));
                mahasiswa.setStatus(rs.getInt("status"));
                mahasiswaList.add(mahasiswa);
            }
        }
        return mahasiswaList;
    }

    public boolean validateLogin(String nim, String password) throws SQLException {
        String sql = "SELECT * FROM datauas WHERE nim = ? AND password = ?";
        try (PreparedStatement pstmt = config.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, nim);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int status = rs.getInt("status");
                    if (status == 1) {
                        JOptionPane.showMessageDialog(null, "Akun anda sedang digunakan", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else if (status == 2) {
                        JOptionPane.showMessageDialog(null, "Anda telah menyelesaikan ujian ini", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "NIM atau Password yang dimasukkan salah!","Login Gagal",JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
    }

    public void updateNilai(String nim, int countBenar) throws SQLException {
        String sql = "UPDATE datauas SET nilai = ? WHERE nim = ?";
        try (PreparedStatement pstmt = config.getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, countBenar);
            pstmt.setString(2, nim);
            pstmt.executeUpdate();
        }
    }

    public void updateStatus(String nim, int status) throws SQLException {
        String sql = "UPDATE datauas SET status = ? WHERE nim = ?";
        try (PreparedStatement pstmt = config.getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, status);
            pstmt.setString(2, nim);
            pstmt.executeUpdate();
        }
    }
}
