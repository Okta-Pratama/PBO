package j5_TEORI;
public class Mahasiswa extends Anggota {
    private String nim;

    public Mahasiswa(String idAnggota, String nama, String nim) {
        super(idAnggota, nama);
        this.nim = nim;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", NIM: " + nim + " (Tipe: Mahasiswa)";
    }
}