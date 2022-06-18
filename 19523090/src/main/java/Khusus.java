/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public final class Khusus extends RumahSick {
    int kap;
    String room;
    public Khusus(String room,String nama, String alamat, String tipe) {
        super(nama, alamat, tipe);
        this.room = room;
        suratPer();
    }

    public int getKap() {
        return kap;
    }

    public void setKap(int kap) {
        this.kap = kap;
    }

    @Override
    public void suratPer() {
        System.out.println("Tidak melayani pasien Covid-19");
    }

    @Override
    public String toString() {
        return "Khusus{" + "kap=" + kap + ", room=" + room + '}';
    }
    
    
}
