/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;
import selamat.Pagi;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Handphone {
    public static String merek;
    public String jenis;
    private int SEIN;
    final int battery;

    public Handphone(String jenis, int SEIN, int bat) {
        this.jenis = jenis;
        this.SEIN = SEIN;
        this.battery = bat;
    }    
    
    public static void change(){
            merek = "Oppo";
        }

//    public String getMerek() {
//        return merek;
//    }
//
//    public void setMerek(String merek) {
//        this.merek = merek;
//    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getSEIN() {
        return SEIN;
    }

    public void setSEIN(int SEIN) {
        this.SEIN = SEIN;
    }
    
    
    public void hidupkan(){
        System.out.println("Hanphone milik anda telah menyala");
    }
     public void matikan(){
         System.out.println("Handphone  milik anda telah mati");
     }

    @Override
    public String toString() {
        return "Handphone{" + "merek=" + merek + ", jenis=" + jenis + ", SEIN=" + SEIN + '}';
    }
     
}