package j5_TEORI;
public class Anggota {
    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public String getInfo() {
        return "ID Anggota: " + idAnggota + ", Nama: " + nama;
    }
}