package j5_TEORI;

public class Buku {
    private String isbn;
    private String judul;

    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
}