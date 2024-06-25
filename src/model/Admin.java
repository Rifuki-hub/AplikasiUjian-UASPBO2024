package model;

public class Admin {
    private final String nim;
    private final String password;

    public Admin() {
        this.nim = "Admin1";
        this.password = "PasswordAdmin";
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    public String getPassword() {
        return password;
    }
}
