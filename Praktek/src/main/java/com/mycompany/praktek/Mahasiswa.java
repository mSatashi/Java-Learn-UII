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

public class Mahasiswa{
    private String NIM;
    Manusia mns;
    Mahasiswa(String NIM,Manusia man) {
        this.mns = man;
        this.NIM = NIM;
    }
    public void setNIM(String newNIM){
        this.NIM = newNIM;
    }
    public String getNIM(){

        return NIM;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", Nama=" + mns.getNama() +", Umur=" + mns.getUmur()+
                '}';
    }
}

