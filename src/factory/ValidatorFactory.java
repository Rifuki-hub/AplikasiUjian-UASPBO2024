package factory;

import model.Admin;
import model.Mahasiswa;
import strategy.AdminLoginStrategy;
import strategy.LoginStrategy;
import strategy.MahasiswaRegistrationStrategy;
import strategy.RegistrationStrategy;
import strategy.UserLoginStrategy;

public class ValidatorFactory {
     Admin admin = new Admin();

    public LoginStrategy getLoginStrategy(String nim) {
        if (nim.equals(admin.getNim())) {
            return new AdminLoginStrategy();
        } else {
            return new UserLoginStrategy();
        }
    }
    
    public RegistrationStrategy getRegistrationStrategy(Mahasiswa mhs) {
        return new MahasiswaRegistrationStrategy();
    }
}
