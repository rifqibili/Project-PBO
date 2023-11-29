import java.util.Date;
import sistemperpustakaan.AnggotaPerpustakaan;
import sistemperpustakaan.Buku;

public class TransaksiPeminjaman {
    private String id;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String waktu;
    private int durasiPeminjaman;
    private AnggotaPerpustakaan anggota;
    private Buku buku;

    public TransaksiPeminjaman(String id, Date tanggalPeminjaman, Date tanggalPengembalian,String waktu, int durasiPeminjaman, AnggotaPerpustakaan anggota, Buku buku) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
   
    
}
