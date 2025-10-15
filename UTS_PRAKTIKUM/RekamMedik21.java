import java.util.ArrayList;
import java.util.List;

public class RekamMedik21 {
    private int id21;
    private Pasien21 pasien21;
    private List<Pemeriksaan21> daftarPemeriksaan21;

    public RekamMedik21(int id21, Pasien21 pasien21) {
        this.id21 = id21;
        this.pasien21 = pasien21;
        this.daftarPemeriksaan21 = new ArrayList<>();
    }

    public void tambahPemeriksaan21(Pemeriksaan21 pemeriksaan21) {
        if (daftarPemeriksaan21 == null) { 
            daftarPemeriksaan21 = new ArrayList<>();
        }
        daftarPemeriksaan21.add(pemeriksaan21);
    }

    public int getId21() {
        return id21;
    }

    public Pasien21 getPasien21() {
        return pasien21;
    }

    public List<Pemeriksaan21> getDaftarPemeriksaan21() {
        return daftarPemeriksaan21; 
    }

    public void setDaftarPemeriksaan21(List<Pemeriksaan21> daftarPemeriksaan21) {
        this.daftarPemeriksaan21 = daftarPemeriksaan21;
    }
}