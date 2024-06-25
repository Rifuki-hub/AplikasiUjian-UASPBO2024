package strategy;

import javax.swing.JFrame;

public interface LoginStrategy {
    void login(String nim, String password, JFrame frame);
}