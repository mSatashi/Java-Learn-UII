/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktek;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Newmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
         String name, nim;
         int um;
         Manusia mns1 = new Manusia("Jumang",18);
         Mahasiswa mhs2 = new Mahasiswa("19523043",mns1);
        /* r.nextLine();
         System.out.println("Tuliskan nama baru: ");
         name = r.nextLine();
          System.out.println("Tuliskan  baru: ");
         nim = r.nextLine();
         mhs3.setNama(name);
         mhs3.setNIM(nim);*/
          System.out.println(mhs2.toString());
    


         //mas mau sholat dulu :))
    }
    
}
