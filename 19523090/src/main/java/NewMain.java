
import java.util.Arrays;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RumahSick rs[] = null;
        String Pelayanan[] = {"THT","Mata","Paru-paru"};
        
        Umum u1= new Umum("RS. Karyadi","Jl.ABCDE","C");
        Umum u2= new Umum(Pelayanan,"RS.Sakit Hati","Jl. Politikus","B");
        Khusus k1= new Khusus("THT","RS. Hidup Kembali","Jl.Diponegoro","A");
        rs[0]= u1;
        u1.toString();
        u1.kap = 5;
        u1.getKap();
        rs[1]= u2;
        u2.toString();
        u2.kap =6;
        u2.getKap();
        rs[2]=k1;
        k1.toString();
        k1.kap =5;
        k1.getKap();
        
        
        
    }
    
}
