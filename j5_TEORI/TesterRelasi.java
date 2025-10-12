package j5_TEORI;
import java.time.LocalDate;

public class TesterRelasi {
    
    public static void main(String[] args) {
        
        System.out.println("=================================================");
        System.out.println("           SISTEM INFORMASI PERPUSTAKAAN");
        System.out.println("=================================================");
        
        System.out.println("\n--- DATA ANGGOTA BARU DIDAFTARKAN ---");
        
        Dosen dsn = new Dosen("A001", "Budi Santoso", "19800101");
        Mahasiswa mhs = new Mahasiswa("A002", "Siti Aisyah", "20220101");
        
        System.out.println("[Data 1] " + dsn.getInfo());
        System.out.println("[Data 2] " + mhs.getInfo());
        
        System.out.println("\n--- PENGELOLAAN KOLEKSI BUKU ---");
        
        Buku buku1 = new Buku("978-602", "Pemrograman Java Lanjut");
        Buku buku2 = new Buku("978-603", "Struktur Data Cepat");
        
        Perpustakaan lib = new Perpustakaan();
        lib.tambahBuku(buku1);
        lib.tambahBuku(buku2);
        
        System.out.println("INFO: 2 buku berhasil ditambahkan ke dalam katalog Perpustakaan.");
        
        Buku hasilCari = lib.cariBuku("Pemrograman Java Lanjut");
        System.out.println("VERIFIKASI: Pencarian buku 'Pemrograman Java Lanjut'...");
        System.out.println("HASIL: " + (hasilCari != null ? "Ditemukan, Judul: " + hasilCari.getJudul() : "Tidak Ditemukan"));
        
        System.out.println("\n--- TRANSAKSI PEMINJAMAN & PENGECEKAN DENDA ---");
        
        LocalDate tglKembaliRencana = LocalDate.of(2025, 10, 10); 
        LocalDate tglAktualKembali = LocalDate.of(2025, 10, 12); // Terlambat 2 hari
        
        Peminjaman pinjaman = new Peminjaman(LocalDate.now(), tglKembaliRencana);
        Laporan laporan = new Laporan();
        
        System.out.println("Peminjaman Rencana Kembali: " + tglKembaliRencana);
        System.out.println("Peminjaman Aktual Kembali: " + tglAktualKembali);
        System.out.println("== HASIL AUDIT DENDA ==");
        
        laporan.generateLaporanDenda(pinjaman, tglAktualKembali);
        System.out.println("=================================================");
    }
}