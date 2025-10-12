package J6_TEORI;
public abstract class AnggotaKampus {
    protected String nama;
    protected String id;

    public AnggotaKampus(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public abstract String getPeran();
}
