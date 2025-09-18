package J3_TEORI;

public class pinjol {
    private String namaPeminjam;
    private double jumlahPinjaman;
    private double bunga;     // persen per bulan
    private int tenor;        // lama pinjaman (bulan)

    public pinjol(String namaPeminjam, double jumlahPinjaman, double bunga, int tenor) {
        this.namaPeminjam = namaPeminjam;
        this.jumlahPinjaman = jumlahPinjaman;
        this.bunga = bunga;
        this.tenor = tenor;
    }

    // Getter & Setter
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(double jumlahPinjaman) {
        if (jumlahPinjaman > 0) {
            this.jumlahPinjaman = jumlahPinjaman;
        } else {
            System.out.println("Jumlah pinjaman harus lebih dari 0.");
        }
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga >= 0) {
            this.bunga = bunga;
        } else {
            System.out.println("Bunga tidak boleh negatif.");
        }
    }

    public int getTenor() {
        return tenor;
    }

    public void setTenor(int tenor) {
        if (tenor > 0) {
            this.tenor = tenor;
        } else {
            System.out.println("Tenor harus lebih dari 0 bulan.");
        }
    }

    // Hitung total pinjaman dengan bunga flat
    public double hitungTotalPinjaman() {
        double totalBunga = jumlahPinjaman * (bunga / 100) * tenor;
        return jumlahPinjaman + totalBunga;
    }

    // Hitung angsuran bulanan
    public double hitungAngsuranBulanan() {
        return hitungTotalPinjaman() / tenor;
    }

    // Tampilkan detail pinjaman
    public void tampilkanInfoPinjaman() {
        System.out.println("=== INFORMASI PINJAMAN ===");
        System.out.println("Nama Peminjam   : " + namaPeminjam);
        System.out.println("Jumlah Pinjaman : Rp. " + jumlahPinjaman);
        System.out.println("Bunga           : " + bunga + "% per bulan");
        System.out.println("Tenor           : " + tenor + " bulan");
        System.out.println("Total Pinjaman  : Rp. " + hitungTotalPinjaman());
        System.out.println("Angsuran/Bulan  : Rp. " + hitungAngsuranBulanan());
        System.out.println("==========================");
    }
}
