package J5_TEORI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Peminjaman {
    private LocalDate tglPinjam;
    private LocalDate tglKembaliRencana; 

    public Peminjaman(LocalDate tglPinjam, LocalDate tglKembaliRencana) {
        this.tglPinjam = tglPinjam;
        this.tglKembaliRencana = tglKembaliRencana;
    }

    public long getSelisihHari(LocalDate tglAktualKembali) {
        if (tglAktualKembali.isAfter(tglKembaliRencana)) {
            return ChronoUnit.DAYS.between(tglKembaliRencana, tglAktualKembali);
        }
        return 0; 
    }
}