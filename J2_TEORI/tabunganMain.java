public class tabunganMain {
    public static void main(String[] args) {
        tabungan t1 = new tabungan("1234567890", "Okta Pratama", 1_000_000);
        tabungan t2 = new tabungan("9876543210", "Budi Santoso", 500_000);

        t1.cekSaldo();
        t1.simpanUang(250_000);
        t1.ambilUang(100_000);

        t2.cekSaldo();
        t2.simpanUang(150_000);
        t2.ambilUang(50_000);

        // Transfer uang antar rekening
        t1.transfer(t2, 300_000);

        // Dapat bunga 5%
        t1.dapatBunga(5);
        t2.dapatBunga(3);

        // Cek saldo akhir
        t1.cekSaldo();
        t2.cekSaldo();
    }
}
