public class Kursus {
    private String namaKursus;
    private Instruktur instruktur;
    private Konten[] daftarKonten;
    private Peserta[] daftarPeserta;

    public Kursus(String namaKursus, Instruktur instruktur, Konten[] daftarKonten, Peserta[] daftarPeserta) {
        this.namaKursus = namaKursus;
        this.instruktur = instruktur;
        this.daftarKonten = daftarKonten;
        this.daftarPeserta = daftarPeserta;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public Instruktur getInstruktur() {
        return instruktur;
    }

    public Konten[] getDaftarKonten() {
        return daftarKonten;
    }

    public Peserta[] getDaftarPeserta() {
        return daftarPeserta;
    }
}
