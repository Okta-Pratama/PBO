public class Kuis {
    private String judul;
    private int jumlahSoal;

    public Kuis(String judul, int jumlahSoal) {
        this.judul = judul;
        this.jumlahSoal = jumlahSoal;
    }

    public String getJudul() {
        return judul;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }
}
