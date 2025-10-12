package J7_TEORI;


public class Manager {
    protected String nama;
    protected float gaji;

    public Manager(String nama, float gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        this.gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.println("======================================");
        System.out.println("Jabatan  : Manager");
        System.out.println("Nama     : " + this.nama);
        System.out.println("Gaji     : " + this.gaji + " IDR");
    }
}