/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opendataperum;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author hp
 */
public class OpenDataPerum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perumahan perum = new Perumahan();
        XStream xstream = new XStream(new StaxDriver());
        
        FileInputStream f = null;
        try{
            f =new FileInputStream("perum.xml");
            
            int isi;
            char cr;
            String sxml = "";
            
            while ((isi = f.read())!= -1){
                cr = (char)isi;
                sxml = sxml+cr;
            }
            perum = (Perumahan)xstream.fromXML(sxml);
            
        }
        catch (Exception e){
            System.out.println("Perhatian: "+e.getMessage());
        }
        finally {
            if (f!=null){
                try{
                    f.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(perum);
    }
    
}
