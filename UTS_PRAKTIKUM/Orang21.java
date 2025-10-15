import java.util.Objects;

public class Orang21 {
    private String nama21;
    private boolean jenisKelamin21; 
    private String alamat21;
    private String noTelp21;

    public Orang21(String nama21, Boolean jenisKelamin21, String alamat21, String noTelp21) {
        this.nama21 = nama21;
        this.jenisKelamin21 = jenisKelamin21;
        this.alamat21 = alamat21;
        this.noTelp21 = noTelp21;
    }

    public Orang21(String nama21, Boolean jenisKelamin21) {
        this.nama21 = nama21;
        this.jenisKelamin21 = jenisKelamin21;
        this.alamat21 = "N/A";
        this.noTelp21 = "N/A";
    }

    public String getNama21() {
        return nama21;
    }

    public boolean getJenisKelamin21() {
        return jenisKelamin21;
    }
    
    public String getAlamat21() {
        return alamat21;
    }

    public String getNoTelp21() {
        return noTelp21;
    }

    public void setNama21(String nama21) {
        this.nama21 = nama21;
    }
    
    public void setJenisKelamin21(boolean jenisKelamin21) {
        this.jenisKelamin21 = jenisKelamin21;
    }

    public void setAlamat21(String alamat21) {
        this.alamat21 = alamat21;
    }

    public void setNoTelp21(String noTelp21) {
        this.noTelp21 = noTelp21;
    }
    
    @Override 
    public String toString() {
        return "Nama: " + nama21 + ", JK: " + (jenisKelamin21 ? "Laki-laki" : "Perempuan") + ", Alamat: " + alamat21 + ", Telp: " + noTelp21;
    }
}