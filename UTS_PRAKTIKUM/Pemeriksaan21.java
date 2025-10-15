import java.util.Date;

public class Pemeriksaan21 {
    private int id21;
    private Date tanggalPemeriksaan21;
    private String keluhan21;
    private String diagnosa21;
    private String tindakan21;
    private String obat21;
    private Dokter21 dokter21;

    public Pemeriksaan21(int id21, Date tanggalPemeriksaan21, String keluhan21, String diagnosa21, String tindakan21, String obat21, Dokter21 dokter21) {
        this.id21 = id21;
        this.tanggalPemeriksaan21 = tanggalPemeriksaan21;
        this.keluhan21 = keluhan21;
        this.diagnosa21 = diagnosa21;
        this.tindakan21 = tindakan21;
        this.obat21 = obat21;
        this.dokter21 = dokter21;
    }

    public int getId21() {
        return id21;
    }
    
    public Date getTanggalPemeriksaan21() {
        return tanggalPemeriksaan21;
    }

    public String getKeluhan21() {
        return keluhan21;
    }
    
    public String getDiagnosa21() {
        return diagnosa21;
    }
    
    public String getTindakan21() {
        return tindakan21;
    }
    
    public String getObat21() {
        return obat21;
    }
    
    public Dokter21 getDokter21() {
        return dokter21;
    }
    
    @Override 
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        String tgl = (tanggalPemeriksaan21 != null) ? sdf.format(tanggalPemeriksaan21) : "N/A";
        return "ID Pemeriksaan: " + id21 + ", Tgl: " + tgl + ", Keluhan: " + keluhan21 + ", Diagnosa: " + diagnosa21 + ", Dokter: " + dokter21.getNama21();
    }
}