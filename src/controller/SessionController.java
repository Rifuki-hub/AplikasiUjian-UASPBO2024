/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author rifky
 */
public class SessionController {
    private static SessionController instance;
    private String currentUser;

    private SessionController() {
        // Konstruktor privat untuk mencegah instansiasi
    }

    public static synchronized SessionController getInstance() {
        if (instance == null) {
            instance = new SessionController();
        }
        return instance;
    }

    public void login(String nim) {
        this.currentUser = nim;
    }

    public void logout() {
        this.currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}

