package alhamdulillah;

public class Petani {
    private String nama, namaTanaman;
    private int hasil;
    private String Jenis;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaTanaman() {
        return namaTanaman;
    }

    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    @Override
    public String toString() {
        return "Petani{" +
                "nama='" + nama + '\'' +
                ", namaTanaman='" + namaTanaman + '\'' +
                ", hasil=" + hasil +
                ", Jenis='" + Jenis + '\'' +
                '}';
    }
}
