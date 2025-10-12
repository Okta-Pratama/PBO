package J7_TEORI;

public class SalesManager extends Manager {
    protected String department;

    public SalesManager(String nama, float gaji, String department) {
        super(nama, gaji);
        this.department = department;
    }

    @Override
    public void naikkanGaji() {
        this.gaji += 1000000;
    }

    @Override
    public void cetakStatus() {
        System.out.println("======================================");
        System.out.println("Jabatan  : Sales Manager");
        System.out.println("Nama     : " + this.nama);
        System.out.println("Gaji     : " + this.gaji + " IDR");
        System.out.println("Departemen: " + this.department);
    }
}