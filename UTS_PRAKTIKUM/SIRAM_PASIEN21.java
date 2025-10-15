import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

public class SIRAM_PASIEN21 {
    private static List<Pasien21> daftarPasien21 = new ArrayList<>();
    private static List<Dokter21> daftarDokter21 = new ArrayList<>();
    
    private static final Scanner scanner = new Scanner(System.in);
    
    private static int getInputInteger21(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                if (scanner.hasNextInt()) { 
                    int value = scanner.nextInt();
                    scanner.nextLine(); 
                    return value;
                } else {
                    System.out.println("Input salah! Harap masukkan angka bulat.");
                    scanner.nextLine(); 
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input.");
                scanner.nextLine(); 
            }
        }
    }

    private static Date getInputDate21(String prompt) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false); 
        Date date = null;
        while (date == null) {
            System.out.print(prompt);
            String inputDate = scanner.nextLine();
            try {
                date = formatter.parse(inputDate);
            } catch (java.text.ParseException e) {
                System.out.println("Format tanggal salah! Harap gunakan format dd/MM/yyyy.");
            }
        }
        return date;
    }
    
    public static void main(String[] args) {
        tampilkanMenu21();
    }
    
    private static void tampilkanMenu21() {
        int pilihan;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Menu Program SIRAM PASIEN =====");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Update Data Pasien");
            System.out.println("3. Tampilkan Daftar Pasien");
            System.out.println("4. Tambah Dokter");
            System.out.println("5. Update Data Dokter");
            System.out.println("6. Tampilkan Daftar Dokter");
            System.out.println("7. Tambah Riwayat Pemeriksaan (Rekam Medik) Pasien");
            System.out.println("8. Tampilkan Riwayat Pemeriksaan (Rekam Medik) Pasien");
            System.out.println("9. Selesai");
            System.out.print("Pilih Menu Nomer? ");

            pilihan = getInputInteger21(""); 

            switch (pilihan) {
                case 1:
                    tambahPasien21();
                    break;
                case 2:
                    updateDataPasien21(); 
                    break;
                case 3:
                    tampilkanDaftarPasien21();
                    break;
                case 4:
                    tambahDokter21();
                    break;
                case 5:
                    updateDataDokter21();
                    break;
                case 6:
                    tampilkanDaftarDokter21();
                    break;
                case 7:
                    tambahRiwayatPemeriksaan21();
                    break;
                case 8:
                    tampilkanRiwayatPemeriksaan21();
                    break;
                case 9:
                    System.out.println("Program Berakhir. Terima kasih!");
                    exit = true; 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
    
    private static void tambahPasien21() {
        System.out.println("\n--- Tambah Pasien Baru ---");
        int id = getInputInteger21("Masukkan ID Pasien: ");
        
        System.out.print("Masukkan Nama Pasien: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jkInput = scanner.nextLine();
        boolean jenisKelamin = jkInput.equalsIgnoreCase("L"); 

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        
        System.out.print("Masukkan Nomor Telepon: ");
        String noTelp = scanner.nextLine();
        
        Pasien21 pasienBaru = new Pasien21(id, nama, jenisKelamin, alamat, noTelp);
        daftarPasien21.add(pasienBaru);
        System.out.println("✅ Pasien " + nama + " berhasil ditambahkan.");
    }
    
    private static void updateDataPasien21() {
        System.out.println("\n--- Update Data Pasien ---");
        int id = getInputInteger21("Masukkan ID Pasien yang akan diupdate: ");
        
        Pasien21 pasien = daftarPasien21.stream()
                .filter(p -> p.getId21() == id)
                .findFirst()
                .orElse(null);

        if (pasien == null) {
            System.out.println("❌ Pasien dengan ID " + id + " tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan Nama Baru (" + pasien.getNama21() + "): ");
        String namaBaru = scanner.nextLine();
        if (!namaBaru.trim().isEmpty()) {
            pasien.setNama21(namaBaru);
        }

        System.out.print("Masukkan Alamat Baru (" + pasien.getAlamat21() + "): ");
        String alamatBaru = scanner.nextLine();
        if (!alamatBaru.trim().isEmpty()) {
            pasien.setAlamat21(alamatBaru);
        }
        
        System.out.println("✅ Data Pasien " + pasien.getNama21() + " berhasil diupdate.");
    }

    private static void tampilkanDaftarPasien21() {
        System.out.println("\n--- Daftar Pasien (" + daftarPasien21.size() + " data) ---");
        if (daftarPasien21.isEmpty()) {
            System.out.println("Belum ada data Pasien.");
            return;
        }
        for (Pasien21 p : daftarPasien21) {
            System.out.println(p.toString());
        }
    }
    
    private static void tambahDokter21() {
        System.out.println("\n--- Tambah Dokter Baru ---");
        int id = getInputInteger21("Masukkan ID Dokter: ");
        
        System.out.print("Masukkan Nama Dokter: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jkInput = scanner.nextLine();
        boolean jenisKelamin = jkInput.equalsIgnoreCase("L"); 

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        
        System.out.print("Masukkan Nomor Telepon: ");
        String noTelp = scanner.nextLine();
        
        System.out.print("Masukkan Spesialisasi: ");
        String spesialisasi = scanner.nextLine();
        
        Dokter21 dokterBaru = new Dokter21(id, nama, jenisKelamin, alamat, noTelp, spesialisasi);
        daftarDokter21.add(dokterBaru);
        System.out.println("✅ Dokter " + nama + " berhasil ditambahkan.");
    }
    
    private static void updateDataDokter21() {
        System.out.println("\n--- Update Data Dokter ---");
        int id = getInputInteger21("Masukkan ID Dokter yang akan diupdate: ");
        
        Dokter21 dokter = daftarDokter21.stream()
                .filter(d -> d.getId21() == id)
                .findFirst()
                .orElse(null);

        if (dokter == null) {
            System.out.println("❌ Dokter dengan ID " + id + " tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan Nama Baru (" + dokter.getNama21() + "): ");
        String namaBaru = scanner.nextLine();
        if (!namaBaru.trim().isEmpty()) {
            dokter.setNama21(namaBaru);
        }
        
        System.out.print("Masukkan Spesialisasi Baru (" + dokter.getSpesialisasi21() + "): ");
        String spesialisasiBaru = scanner.nextLine();
        if (!spesialisasiBaru.trim().isEmpty()) {
            dokter.setSpesialisasi21(spesialisasiBaru);
        }

        System.out.println("✅ Data Dokter " + dokter.getNama21() + " berhasil diupdate.");
    }

    private static void tampilkanDaftarDokter21() {
        System.out.println("\n--- Daftar Dokter (" + daftarDokter21.size() + " data) ---");
        if (daftarDokter21.isEmpty()) {
            System.out.println("Belum ada data Dokter.");
            return;
        }
        for (Dokter21 d : daftarDokter21) {
            System.out.println(d.toString());
        }
    }
    
    private static void tambahRiwayatPemeriksaan21() {
        System.out.println("\n--- Tambah Riwayat Pemeriksaan ---");
        
        if (daftarPasien21.isEmpty() || daftarDokter21.isEmpty()) {
            System.out.println("❌ Perlu ada Pasien dan Dokter terdaftar sebelum menambah riwayat.");
            return;
        }
        
        int idPasien = getInputInteger21("Masukkan ID Pasien yang akan diperiksa: ");
        Pasien21 pasien = daftarPasien21.stream()
                .filter(p -> p.getId21() == idPasien)
                .findFirst()
                .orElse(null);

        if (pasien == null) {
            System.out.println("❌ Pasien dengan ID " + idPasien + " tidak ditemukan.");
            return;
        }

        int idDokter = getInputInteger21("Masukkan ID Dokter yang memeriksa: ");
        Dokter21 dokter = daftarDokter21.stream()
                .filter(d -> d.getId21() == idDokter)
                .findFirst()
                .orElse(null);

        if (dokter == null) {
            System.out.println("❌ Dokter dengan ID " + idDokter + " tidak ditemukan.");
            return;
        }
        
        int idPemeriksaan = pasien.getRekamMedik21().getDaftarPemeriksaan21().size() + 1; 
        Date tanggalPemeriksaan = getInputDate21("Masukkan Tanggal Pemeriksaan (dd/MM/yyyy): ");
        
        System.out.print("Masukkan Keluhan: ");
        String keluhan = scanner.nextLine();
        
        System.out.print("Masukkan Diagnosa: ");
        String diagnosa = scanner.nextLine();
        
        System.out.print("Masukkan Tindakan: ");
        String tindakan = scanner.nextLine();
        
        System.out.print("Masukkan Obat yang diberikan: ");
        String obat = scanner.nextLine();
        
        Pemeriksaan21 pemeriksaanBaru = new Pemeriksaan21(idPemeriksaan, tanggalPemeriksaan, keluhan, diagnosa, tindakan, obat, dokter);
        
        pasien.getRekamMedik21().tambahPemeriksaan21(pemeriksaanBaru);
        System.out.println("✅ Riwayat Pemeriksaan untuk Pasien " + pasien.getNama21() + " berhasil ditambahkan.");
    }
    
    private static void tampilkanRiwayatPemeriksaan21() {
        System.out.println("\n--- Tampilkan Riwayat Pemeriksaan ---");
        
        int idPasien = getInputInteger21("Masukkan ID Pasien yang ingin dilihat riwayatnya: ");
        Pasien21 pasien = daftarPasien21.stream()
                .filter(p -> p.getId21() == idPasien)
                .findFirst()
                .orElse(null);
        
        if (pasien == null) {
            System.out.println("❌ Pasien dengan ID " + idPasien + " tidak ditemukan.");
            return;
        }
        
        RekamMedik21 rm = pasien.getRekamMedik21();
        List<Pemeriksaan21> riwayat = rm.getDaftarPemeriksaan21();

        System.out.println("\nRiwayat Pemeriksaan Pasien: " + pasien.getNama21() + " (ID: " + pasien.getId21() + ")");
        System.out.println("Total Riwayat: " + riwayat.size());
        
        if (riwayat.isEmpty()) {
            System.out.println("Belum ada riwayat pemeriksaan untuk pasien ini.");
        } else {
            for (Pemeriksaan21 p : riwayat) {
                System.out.println(" - " + p.toString()); 
            }
        }
    }
}