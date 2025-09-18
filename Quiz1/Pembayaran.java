public class Pembayaran {
    private Peserta peserta;
    private Kursus kursus;
    private double jumlah;

    public Pembayaran(Peserta peserta, Kursus kursus, double jumlah) {
        this.peserta = peserta;
        this.kursus = kursus;
        this.jumlah = jumlah;
    }

    public void konfirmasi() {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " dari " + peserta.getNama() +
                " untuk kursus " + kursus.getNamaKursus() + " berhasil.");
    }
}
