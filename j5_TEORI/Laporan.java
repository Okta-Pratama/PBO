package j5_TEORI;
import java.time.LocalDate;

public class Laporan {
    public void generateLaporanDenda(Peminjaman peminjaman, LocalDate tglAktualKembali) {
        
        long hariTerlambat = peminjaman.getSelisihHari(tglAktualKembali);
        
        if (hariTerlambat > 0) {
            double denda = hariTerlambat * 1000.0;
            System.out.println("Status Laporan: TERLAMBAT");
            System.out.println("Hari Keterlambatan: " + hariTerlambat + " hari");
            System.out.println("Total Denda: Rp " + denda);
        } else {
            System.out.println("Status Laporan: TEPAT WAKTU");
        }
    }
}