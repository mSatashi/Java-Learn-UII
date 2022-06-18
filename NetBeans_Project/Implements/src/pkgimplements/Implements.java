/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgimplements;

/**
 *
 * @author hp
 */
public class Implements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Mercedez myCar = new Mercedez();  
            myCar.engineSound();
            myCar.sleep();
            //abstract
            Person pr = new Person();
            pr.jobName = "Driver";
            pr.jobName();
    }
    
}
