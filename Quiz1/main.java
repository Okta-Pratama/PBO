public class main {
    public static void main(String[] args) {
        Instruktur instruktur1 = new Instruktur("Andi", "Pemrograman Java");
        Peserta peserta1 = new Peserta("Budi", "budi@mail.com");

        Konten konten1 = new Konten("Intro Java", "Video");
        Konten konten2 = new Konten("OOP Concept", "Artikel");

        Konten[] daftarKonten = {konten1, konten2};
        Peserta[] daftarPeserta = {peserta1};

        Kursus kursus = new Kursus("Belajar Java Dasar", instruktur1, daftarKonten, daftarPeserta);

        System.out.println("=== Informasi Kursus ===");
        System.out.println("Nama Kursus : " + kursus.getNamaKursus());
        System.out.println("Instruktur  : " + kursus.getInstruktur().getNama() + " (" + kursus.getInstruktur().getKeahlian() + ")");
        System.out.println("Peserta     : " + kursus.getDaftarPeserta()[0].getNama());

        System.out.println("\n=== Daftar Konten ===");
        for (Konten k : kursus.getDaftarKonten()) {
            System.out.println("- " + k.getJudul() + " (" + k.getTipe() + ")");
        }

        System.out.println("\n=== Pembayaran ===");
        Pembayaran pembayaran = new Pembayaran(peserta1, kursus, 500000);
        pembayaran.konfirmasi();
    }
}