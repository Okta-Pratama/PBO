public class handphone {
    public static void main(String[] args) {
        handphoneBeraksi hp = new handphoneBeraksi();

        hp.tampilSemuaStatus();

        hp.setStatusAktif(1);
        hp.setStatusPanggilan(1);
        hp.setStatusSMS(1);
        hp.tampilSemuaStatus();

        hp.setStatusPanggilan(2);
        hp.setStatusSMS(2);
        hp.tampilSemuaStatus();

        hp.setStatusAktif(0);
        hp.setStatusPanggilan(0);
        hp.setStatusSMS(0);
        hp.tampilSemuaStatus();
    }
}
