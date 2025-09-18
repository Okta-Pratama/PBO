public class tabungan {
   private String norek;
    private String namaPemilik;
    private double saldo;

    public tabungan(String norek, String namaPemilik, double saldo) {
        this.norek = norek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void cekSaldo() {
        System.out.println("Saldo tabungan " + namaPemilik + " (" + norek + ") sejumlah Rp. " + saldo);
    }

    public void simpanUang(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setoran harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println(namaPemilik + " menyimpan uang sejumlah Rp. " + jumlah);
        cekSaldo();
    }

    public void ambilUang(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
            return;
        }
        if (jumlah < 10000) {
            System.out.println("Penarikan minimal Rp. 10000");
            return;
        }
        if (jumlah > saldo) {
            System.out.println("Maaf, saldo " + namaPemilik + " tidak mencukupi.");
            cekSaldo();
            return;
        }
        saldo -= jumlah;
        System.out.println(namaPemilik + " mengambil uang sebesar Rp. " + jumlah);
        cekSaldo();
    }

    // Variasi tambahan
    public void transfer(tabungan tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah transfer harus lebih dari 0");
            return;
        }
        if (jumlah > saldo) {
            System.out.println("Saldo " + namaPemilik + " tidak mencukupi untuk transfer Rp. " + jumlah);
            return;
        }
        saldo -= jumlah;
        tujuan.simpanUang(jumlah);
        System.out.println("Transfer berhasil sejumlah Rp. " + jumlah + " ke " + tujuan.namaPemilik);
        cekSaldo();
    }

    public void dapatBunga(double persen) {
        if (persen <= 0) {
            System.out.println("Persentase bunga harus lebih dari 0");
            return;
        }
        double bunga = saldo * persen / 100;
        saldo += bunga;
        System.out.println("Tabungan " + namaPemilik + " mendapat bunga Rp. " + bunga);
        cekSaldo();
    }
}
