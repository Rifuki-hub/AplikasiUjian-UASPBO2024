package controller;

import model.Mahasiswa;
import view.main.RegistFrame;
import strategy.RegistrationStrategy;
import factory.ValidatorFactory;

public class RegistrationController {

    private ValidatorFactory validatorFactory;

    public RegistrationController() {
        this.validatorFactory = new ValidatorFactory();
    }

    public void registerMahasiswa(Mahasiswa mhs, RegistFrame frame) {
        RegistrationStrategy registrationStrategy = validatorFactory.getRegistrationStrategy(mhs);
        registrationStrategy.register(mhs, frame);
    }
}
