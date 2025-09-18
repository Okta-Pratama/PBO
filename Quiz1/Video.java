public class Video {
    private String judul;
    private int durasi; 

    public Video(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }
}
