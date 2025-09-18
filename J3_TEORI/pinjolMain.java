package J3_TEORI;

public class pinjolMain {
   public static void main(String[] args) {
        // Membuat objek pinjaman online
        pinjol p1 = new pinjol("Okta Pratama", 5_000_000, 2.5, 12);
        pinjol p2 = new pinjol("Budi Santoso", 10_000_000, 3, 24);

        // Tampilkan info pinjaman
        p1.tampilkanInfoPinjaman();
        p2.tampilkanInfoPinjaman();

        // Update data (contoh penggunaan setter)
        System.out.println("\n=== UPDATE DATA PINJAMAN ===");
        p1.setJumlahPinjaman(7_500_000);
        p1.setTenor(18);
        p1.tampilkanInfoPinjaman();
    }
}
