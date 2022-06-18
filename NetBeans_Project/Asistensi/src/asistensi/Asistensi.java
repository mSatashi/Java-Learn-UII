/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

/**
 *
 * @author hp
 */
public class Asistensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone.change();//cara akses method static
        Handphone hp = new Handphone("A1", 1921037429,2000);
        Handphone hp2 = new Handphone("F1",912824971,3000);
        hp.hidupkan();
        hp2.hidupkan();
        System.out.print(hp);
        System.out.print(hp2);
        
    }
    
}
