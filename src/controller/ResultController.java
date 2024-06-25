package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Mahasiswa;

public class ResultController {

    private DatabaseController databaseController;
    private TableLoadListener listener;

    public ResultController() {
        this.databaseController = new DatabaseController();
    }

    public void setTableLoadListener(TableLoadListener listener) {
        this.listener = listener;
    }

    public void loadTableData() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("NIM");
        dtm.addColumn("Nama");
        dtm.addColumn("Kelas");
        dtm.addColumn("Nilai");
        dtm.addColumn("Status");

        try {
            List<Mahasiswa> mahasiswaList = databaseController.getAllMahasiswa();
            for (Mahasiswa mhs : mahasiswaList) {
                String status = getStatusString(mhs.getStatus());
                dtm.addRow(new Object[]{mhs.getNim(), mhs.getNama(), mhs.getKelas(), mhs.getNilai(), status});
            }

            if (listener != null) {
                listener.onTableDataLoaded(dtm);
            }
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getStatusString(int statusCode) {
        // Mengubah nilai status menjadi teks sesuai format yang diminta
        switch (statusCode) {
            case 0:
                return "Belum Ujian";
            case 1:
                return "Sedang Ujian";
            case 2:
                return "Telah Ujian";
            default:
                return "Tidak diketahui";
        }
    }

    public void exportTableToCSV(JTable table, String path) {
        try (FileWriter csvWriter = new FileWriter(path)) {
            TableModel model = table.getModel();

            // Tulis header kolom
            for (int i = 0; i < model.getColumnCount(); i++) {
                csvWriter.write(model.getColumnName(i) + ",");
            }
            csvWriter.write("\n");

            // Tulis data baris
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    csvWriter.write(model.getValueAt(i, j).toString() + ",");
                }
                csvWriter.write("\n");
            }

            JOptionPane.showMessageDialog(null, "Data berhasil diekspor ke " + path);

            // Buka file CSV dengan Notepad
            Runtime.getRuntime().exec("notepad.exe " + path);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengekspor data.");
        }
    }

    public interface TableLoadListener {

        void onTableDataLoaded(DefaultTableModel model);
    }
}
