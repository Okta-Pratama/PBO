package J7_TEORI;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- 👩‍💼 Inisialisasi Data Karyawan ---");
        
        Manager[] employees = new Manager[3];
        
        employees[0] = new Manager("Laksa", 1000000); 
        employees[1] = new Supervisor("Nizam", 1500000); 
        employees[2] = new SalesManager("Okta", 1000000, "IT & Business Development"); 

        System.out.println("\n--- 📋 Status Karyawan Awal ---");
        for (Manager emp : employees) {
            emp.cetakStatus();
        }

        System.out.println("\n--- ⬆️ Terapkan Kenaikan Gaji ---");
        System.out.println("Memanggil 'naikkanGaji()' untuk semua karyawan...");
        
        for (Manager emp : employees) {
            emp.naikkanGaji();
        }

        System.out.println("\n--- ✅ Status Karyawan Setelah Kenaikan ---");
        for (Manager emp : employees) {
            emp.cetakStatus();
        }
        System.out.println("======================================");
    }
}
