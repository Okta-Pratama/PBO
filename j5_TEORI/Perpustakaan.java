package J5_TEORI;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku; 

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public Buku cariBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                return b;
            }
        }
        return null;
    }
}