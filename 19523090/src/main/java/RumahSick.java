/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public abstract class RumahSick implements Surat {
    String nama;
    String alamat;
    String tipe;

    public RumahSick(String nama, String alamat, String tipe) {
        this.nama = nama;
        this.alamat = alamat;
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return "RumahSick{" + "nama=" + nama + ", alamat=" + alamat + ", tipe=" + tipe + '}';
    }
    
}
