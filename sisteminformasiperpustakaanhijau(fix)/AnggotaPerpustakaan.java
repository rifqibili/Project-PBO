package sistemperpustakaan;

import java.util.Date;
import javax.swing.JOptionPane;

public class AnggotaPerpustakaan {
    private String nama;
    private String nomorAnggota;
    private String alamat;

    public AnggotaPerpustakaan(String nama, String nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
    }

    public void pinjamBuku(Buku buku, String judul, Date tanggalPinjam, int durasiPinjam) {
        String message = "\n" + nama + " berhasil meminjam buku " + judul + ".\n"
                + "Tanggal Pinjam: " + tanggalPinjam + "\n"
                + "Durasi Pinjam: " + durasiPinjam + " hari.";

        JOptionPane.showMessageDialog(null, message, "Peminjaman Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }

    public void kembalikanBuku(Buku buku, String judul, Date tanggalPengembalian) {
        String message = "\n" + nama + " berhasil mengembalikan buku " + judul + ".\n"
                + "Tanggal Pengembalian: " + tanggalPengembalian;

        JOptionPane.showMessageDialog(null, message, "Pengembalian Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}