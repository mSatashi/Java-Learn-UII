/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktek;

/**
 *
 * @author hp
 */
public class Manusia {
    String nama;
    int umur;
 
    Manusia (String nama,int umr){
    this.nama = nama;
    this.umur = umr;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
