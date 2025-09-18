public class handphoneBeraksi {
    private boolean statusAktif;
    private String statusPanggilan;
    private String statusSMS;

    public handphoneBeraksi() {
        this.statusAktif = false;
        this.statusPanggilan = "Menunggu";
        this.statusSMS = "Menunggu";
    }

    public void setStatusAktif(int status) {
        switch (status) {
            case 0: this.statusAktif = false; break;
            case 1: this.statusAktif = true; break;
            default: System.out.println("Status Aktif tidak valid (gunakan 0 atau 1).");
        }
    }

    public void setStatusPanggilan(int status) {
        switch (status) {
            case 0: this.statusPanggilan = "Menunggu"; break;
            case 1: this.statusPanggilan = "Menerima Panggilan"; break;
            case 2: this.statusPanggilan = "Melakukan Panggilan"; break;
            default: System.out.println("Status Panggilan tidak valid (0/1/2).");
        }
    }

    public void setStatusSMS(int status) {
        switch (status) {
            case 0: this.statusSMS = "Menunggu"; break;
            case 1: this.statusSMS = "Menerima SMS"; break;
            case 2: this.statusSMS = "Mengirim SMS"; break;
            default: System.out.println("Status SMS tidak valid (0/1/2).");
        }
    }

    public void tampilSemuaStatus() {
        System.out.println("=== STATUS HANDPHONE ===");
        System.out.println("Aktif     : " + (statusAktif ? "ON" : "OFF"));
        System.out.println("Panggilan : " + statusPanggilan);
        System.out.println("SMS       : " + statusSMS);
        System.out.println("========================");
    }
}
