package J6_TEORI;
public class Mahasiswa extends AnggotaKampus {
    private String nim;
    private String programStudi;

    public Mahasiswa(String nama, String id, String nim, String programStudi) {
        super(nama, id); 
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    @Override
    public String getPeran() {
        return "Mahasiswa";
    }

    @Override
    public String toString() {
        return "Mahasiswa [Nama: " + nama + ", ID: " + id + ", NIM: " + nim + ", Prodi: " + programStudi + "]";
    }
}