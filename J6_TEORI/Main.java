package J6_TEORI;
// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM INFORMASI TATA TERTIB KAMPUS ===");

        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "AK-001", "12345678", "Teknik Informatika");
        Dosen dsn1 = new Dosen("Dr. Ani Wijaya", "AK-002", "98765432", "Sistem Informasi");
        Mahasiswa mhs2 = new Mahasiswa("Rachellia Citra", "AK-003", "12345679", "Sosial");

        System.out.println("\n--- Daftar Anggota ---");
        System.out.println(mhs1);
        System.out.println(dsn1);
        System.out.println(mhs2);

        TataTertib tt1 = new TataTertib("Parkir di area terlarang", "Teguran tertulis dan denda Rp 50.000");
        TataTertib tt2 = new TataTertib("Terlambat mengumpulkan nilai (Dosen)", "Peringatan resmi dari Dekan");
        TataTertib tt3 = new TataTertib("Mencontek saat ujian", "Nilai E untuk mata kuliah dan skorsing 1 semester");

        System.out.println("\n--- Daftar Tata Tertib ---");
        System.out.println(tt1);
        System.out.println(tt2);
        System.out.println(tt3);

        SistemInformasiTataTertib sistemTT = new SistemInformasiTataTertib();

        Pelanggaran p1 = new Pelanggaran(mhs1, tt1, "2025-10-10");
        sistemTT.catatPelanggaran(p1);

        Pelanggaran p2 = new Pelanggaran(dsn1, tt2, "2025-09-25");
        sistemTT.catatPelanggaran(p2);

        Pelanggaran p3 = new Pelanggaran(mhs1, tt3, "2025-10-12");
        sistemTT.catatPelanggaran(p3);

        sistemTT.lihatRiwayatPelanggaran(mhs1); 
        sistemTT.lihatRiwayatPelanggaran(dsn1); 
        sistemTT.lihatRiwayatPelanggaran(mhs2); 
    }
}