/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rifky
 */
public class Pilgan {
    private String pertanyaan;
    private String pilA;
    private String pilB;
    private String pilC;
    private String pilD;
    private String jawabanBenar;
    private String jawabanSiswa;
    
    public Pilgan(String pertanyaan, String pilA, String pilB, String pilC, String pilD, String jawabanBenar){
        this.pertanyaan = pertanyaan;
        this.pilA= pilA;
        this.pilB = pilB;
        this.pilC = pilC;
        this.pilD = pilD;
        this.jawabanBenar = jawabanBenar;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getPilA() {
        return pilA;
    }

    public void setPilA(String pilA) {
        this.pilA = pilA;
    }

    public String getPilB() {
        return pilB;
    }

    public void setPilB(String pilB) {
        this.pilB = pilB;
    }

    public String getPilC() {
        return pilC;
    }

    public void setPilC(String pilC) {
        this.pilC = pilC;
    }

    public String getPilD() {
        return pilD;
    }

    public void setPilD(String pilD) {
        this.pilD = pilD;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(String jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }

    public String getJawabanSiswa() {
        return jawabanSiswa;
    }

    public void setJawabanSiswa(String jawabanSiswa) {
        this.jawabanSiswa = jawabanSiswa;
    }
    public boolean isJawabanBenar(){
        return jawabanBenar.equals(jawabanSiswa);
    }
}
