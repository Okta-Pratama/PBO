package J7_TEORI;


public class Supervisor extends Manager {

    public Supervisor(String nama, float gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        super.gaji += 1500000;
    }

    @Override
    public void cetakStatus() {
        System.out.println("======================================");
        System.out.println("Jabatan  : Supervisor");
        System.out.println("Nama     : " + this.nama);
        System.out.println("Gaji     : " + this.gaji + " IDR");
    }
}