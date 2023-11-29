import java.util.Date;

public class TransaksiPengembalian {
    private String id;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String waktu;
    private int durasiPeminjaman;

    public TransaksiPengembalian(String id, Date tanggalPeminjaman, Date tanggalPengembalian,String waktu, int durasiPeminjaman) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public void catatPengembalian() {
        System.out.println("Transaksi Pengembalian - ID: " + id);
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian);
        System.out.println("Waktu: " + waktu);
        System.out.println("Durasi Peminjaman: " + durasiPeminjaman + " hari");
        System.out.println("Pengembalian berhasil dicatat.");
        System.out.println("");
    }
}
