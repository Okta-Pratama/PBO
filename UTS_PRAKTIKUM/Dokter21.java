public class Dokter21 extends Orang21 {
    private int id21;
    private String spesialisasi21;

    public Dokter21(int id21, String nama21, Boolean jenisKelamin21, String alamat21, String noTelp21, String spesialisasi21) {
        super(nama21, jenisKelamin21, alamat21, noTelp21);
        this.id21 = id21;
        this.spesialisasi21 = spesialisasi21;
    }

    public Dokter21(int id21, String nama21, String spesialisasi21) {
        super(nama21, true, "N/A", "N/A");
        this.id21 = id21;
        this.spesialisasi21 = spesialisasi21;
    }

    public int getId21() {
        return id21;
    }

    public String getSpesialisasi21() {
        return spesialisasi21;
    }
    
    public void setSpesialisasi21(String spesialisasi21) {
        this.spesialisasi21 = spesialisasi21;
    }
    
    @Override 
    public String toString() {
        return "ID Dokter: " + id21 + ", " + super.toString() + ", Spesialisasi: " + spesialisasi21;
    }
}