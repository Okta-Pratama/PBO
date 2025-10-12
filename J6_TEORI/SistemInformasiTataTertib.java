package J6_TEORI;
import java.util.ArrayList;
import java.util.List;

public class SistemInformasiTataTertib {
    private List<Pelanggaran> riwayatPelanggaran;

    public SistemInformasiTataTertib() {
        this.riwayatPelanggaran = new ArrayList<>();
    }

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        riwayatPelanggaran.add(pelanggaran);
        System.out.println("\n✅ Pelanggaran berhasil dicatat:");
        System.out.println(pelanggaran);
        pelanggaran.getPeraturanDilanggar().terapkanSanksi(pelanggaran.getPelanggar());
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("\n--- Riwayat Pelanggaran untuk " + anggota.getNama() + " ---");
        boolean ditemukan = false;
        for (Pelanggaran p : riwayatPelanggaran) {
            if (p.getPelanggar().getId().equals(anggota.getId())) {
                System.out.println(p);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada riwayat pelanggaran yang ditemukan untuk anggota ini.");
        }
        System.out.println("----------------------------------------------------------------");
    }
}
