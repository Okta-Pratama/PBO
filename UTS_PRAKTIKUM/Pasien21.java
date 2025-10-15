public class Pasien21 extends Orang21 {
    private int id21;
    private RekamMedik21 rekamMedik21;

    public Pasien21(int id21, String nama21, Boolean jenisKelamin21, String alamat21, String noTelp21) {
        super(nama21, jenisKelamin21, alamat21, noTelp21); 
        this.id21 = id21;
        this.rekamMedik21 = new RekamMedik21(id21, this); 
    }

    public Pasien21(int id21, String nama21) {
        super(nama21, true, "N/A", "N/A");
        this.id21 = id21;
    }

    public void setRekamMedik21(RekamMedik21 rekamMedik21) { 
        this.rekamMedik21 = rekamMedik21;
    }

    public int getId21() {
        return id21;
    }

    public RekamMedik21 getRekamMedik21() {
        return rekamMedik21;
    }
    
    @Override 
    public String toString() {
        return "ID Pasien: " + id21 + ", " + super.toString(); 
    }
}