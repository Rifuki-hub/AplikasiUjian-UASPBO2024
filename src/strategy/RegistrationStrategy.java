package strategy;

import model.Mahasiswa;
import view.main.RegistFrame;

public interface RegistrationStrategy {
    void register(Mahasiswa mhs, RegistFrame frame);
}
