package j5_TEORI;

public class Dosen extends Anggota {
    private String nip;

    public Dosen(String idAnggota, String nama, String nip) {
        super(idAnggota, nama);
        this.nip = nip;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + ", NIP: " + nip + " (Tipe: Dosen)";
    }
}