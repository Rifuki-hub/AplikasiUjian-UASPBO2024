/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import model.Pilgan;

/**
 *
 * @author rifky
 */
public class SoalController {

    private List<Pilgan> pilgans;

    public SoalController() {
        this.pilgans = createQuestions();
    }

    // Method to create and return a list of questions
    public ArrayList<Pilgan> createQuestions() {
        ArrayList<Pilgan> pilgans = new ArrayList<>();

        pilgans.add(new Pilgan("10 + 10 = ...", "1010", "1", "20", "100", "C"));
        pilgans.add(new Pilgan("Siapa penulis komik Naruto ?", "Miya Nishino", "Mashashi Kishimoto", "Maya Nakamoto", "Suzuki Ajinomoto", "B"));
        pilgans.add(new Pilgan("Dimana lokasi POLSTAT STIS ?", "Jatinegara", "Tebet", "Matraman", "Manggarai", "A"));
        pilgans.add(new Pilgan("Apa warna jersey home timnas sepak bola Indonesia 2024 ?", "Merah", "Putih", "Hijau", "Biru", "A"));
        pilgans.add(new Pilgan("10 x 10 = ...", "1010", "1", "20", "100", "D"));
        pilgans.add(new Pilgan("Berikut adalah grup idola yang berasal dari jepang, kecuali...", "Mashiro na Canvas", "Necopla Pixx", "Devil Anthem", "Kirin Day", "D"));
        pilgans.add(new Pilgan("10 x 10% = ...", "1010", "1", "20", "10", "B"));
        pilgans.add(new Pilgan("Jika kunci jawaban soal ini bukan A, dan bukan 2 kunci jawaban sebelumnya maka jawabannya adalah", "A", "B", "C", "D", "C"));
        pilgans.add(new Pilgan("Berikut adalah nama-nama provinsi di Indonesia pada tahun 2024, kecuali...", "Kalimantan Utara", "Sulawesi Utara", "Sumatera Utara", "Jawa Utara", "D"));
        pilgans.add(new Pilgan("Dimanakah letak Cadas Pangeran?", "Sumedang", "Purwakarta", "Perwokerto", "Kupang", "A"));
        pilgans.add(new Pilgan("Siapakah yang mengetik naskah proklamasi ?", "Sayuti Melik", "Soekarno", "Soedirman", "Megawati", "A"));
        pilgans.add(new Pilgan("Berikut ini anggota awal Mashiro na Canvas, kecuali ...", "Azusa Onodera", "Suzuki Ema", "Yurina Hamabe", "Mugita Hikaru", "C"));
        pilgans.add(new Pilgan("10 + 1000 = ...", "1010", "1", "20", "100", "A"));
        pilgans.add(new Pilgan("Club manakah yang berasal dari Inggris ?", "Juventus", "Real Sociedad", "Inter Miami", "Wolverhampton Wanderers", "D"));
        pilgans.add(new Pilgan("Dimanakah lokasi ujian PBO 2KS4 tahun ini ?", "Audit 1", "Audit 2", "Audit 3", "Audit 4", "D"));

        return pilgans;
    }

    public int getTotalQuestions() {
        return pilgans.size();
    }

    public Pilgan getQuestion(int index) {
        if (index >= 0 && index < pilgans.size()) {
            return pilgans.get(index);
        }
        return null;
    }

    // Method to handle button visibility
    public void updateButtonVisibility(int curIdx, int totalQuestions, JButton btnPrev, JButton btnNext, JButton btnSubmit2) {
        btnPrev.setVisible(curIdx != 0);
        btnNext.setVisible(curIdx != (totalQuestions - 1));
        btnSubmit2.setVisible(curIdx == (totalQuestions - 1));
    }

    // Method to handle question display
    public void updateQuestionDisplay(int curIdx, javax.swing.JLabel txtNomor, javax.swing.JTextArea txtSoal, javax.swing.JRadioButton rbA, javax.swing.JRadioButton rbB, javax.swing.JRadioButton rbC, javax.swing.JRadioButton rbD, javax.swing.JRadioButton rbDefault) {
        Pilgan currentQuestion = getQuestion(curIdx);
        if (currentQuestion != null) {
            txtNomor.setText("" + (curIdx + 1));
            txtSoal.setText(currentQuestion.getPertanyaan());
            rbA.setText(currentQuestion.getPilA());
            rbB.setText(currentQuestion.getPilB());
            rbC.setText(currentQuestion.getPilC());
            rbD.setText(currentQuestion.getPilD());

            rbA.setSelected(false);
            rbB.setSelected(false);
            rbC.setSelected(false);
            rbD.setSelected(false);

            if (currentQuestion.getJawabanSiswa() != null) {
                switch (currentQuestion.getJawabanSiswa()) {
                    case "A":
                        rbA.setSelected(true);
                        break;
                    case "B":
                        rbB.setSelected(true);
                        break;
                    case "C":
                        rbC.setSelected(true);
                        break;
                    case "D":
                        rbD.setSelected(true);
                        break;
                    default:
                        rbDefault.setSelected(true);
                        break;
                }
            } else {
                rbDefault.setSelected(true);
            }
        }
    }

    // Method to update student's answer based on selected radio button
    public void updateJawabanSiswa(int curIdx, javax.swing.JRadioButton rbA, javax.swing.JRadioButton rbB, javax.swing.JRadioButton rbC, javax.swing.JRadioButton rbD) {
        String jawabanSiswa= null;
        if (rbA.isSelected()) {
            jawabanSiswa = "A";
        } else if (rbB.isSelected()) {
            jawabanSiswa = "B";
        } else if (rbC.isSelected()) {
            jawabanSiswa = "C";
        } else if (rbD.isSelected()) {
            jawabanSiswa = "D";
        }
        pilgans.get(curIdx).setJawabanSiswa(jawabanSiswa);
    }

    // Method to count correct answers
    public int hitungJawabanBenar() {
        int countBenar = 0;
        for (Pilgan pilgan : pilgans) {
            if (pilgan.isJawabanBenar()) {
                countBenar++;
            }
        }
        return countBenar;
    }

    // Method to handle submission of answers
    public void submitJawaban(javax.swing.JFrame frame) {
        int countBenar = hitungJawabanBenar();
        String nimUser = SessionController.getInstance().getCurrentUser();

        // Menggunakan SwingWorker untuk operasi database di latar belakang
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                DatabaseController dbController = new DatabaseController();
                dbController.updateNilai(nimUser, countBenar);
                dbController.updateStatus(nimUser, 2);
                return null;
            }

            @Override
            protected void done() {
                try {
                    get(); // untuk menangani exception dari doInBackground
                    JOptionPane.showMessageDialog(frame, "Soal yang benar sebanyak : " + countBenar, "Rangkuman", JOptionPane.INFORMATION_MESSAGE);
                    NavigationController.getInstance().showLoginFrame(frame);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Gagal mengupdate nilai: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        worker.execute(); // Menjalankan SwingWorker
    }

}
