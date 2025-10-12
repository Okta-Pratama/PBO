package J6_TEORI;
// TataTertib.java
public class TataTertib {
    // Atribut
    private String peraturan;
    private String sanksi;

    // Konstruktor
    public TataTertib(String peraturan, String sanksi) {
        this.peraturan = peraturan;
        this.sanksi = sanksi;
    }

    // Metode Getter
    public String getPeraturan() {
        return peraturan;
    }

    public String getSanksi() {
        return sanksi;
    }

    // Metode terapkanSanksi sesuai diagram
    public void terapkanSanksi(AnggotaKampus anggota) {
        System.out.println("--- Penerapan Sanksi ---");
        System.out.println("Anggota: " + anggota.getNama() + " (" + anggota.getPeran() + ")");
        System.out.println("Melanggar: " + peraturan);
        System.out.println("Sanksi Diterapkan: " + sanksi);
        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "Peraturan: " + peraturan + " (Sanksi: " + sanksi + ")";
    }
}