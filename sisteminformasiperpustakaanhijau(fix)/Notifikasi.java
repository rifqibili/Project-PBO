package sistemperpustakaan;

import java.util.Date;
import javax.swing.JOptionPane;

public class Notifikasi {
    private String id;
    private Date tanggal;
    private String pesan;
    private AnggotaPerpustakaan anggota;

    public Notifikasi(String id, Date tanggal, String pesan, AnggotaPerpustakaan anggota) {
        this.id = id;
        this.tanggal = tanggal;
        this.pesan = pesan;
        this.anggota = anggota;
    }
    public void kirimNotifikasiPeminjaman() {
        String notifMessage = "Notifikasi Peminjaman - ID: " + id + "\n"
                + "Tanggal: " + tanggal + "\n"
                + "Pesan: " + pesan + "\n"
                + "Dikirim kepada Anggota: " + anggota.getNama() + "\n"
                + "";
        JOptionPane.showMessageDialog(null, notifMessage, "Notifikasi Peminjaman", JOptionPane.INFORMATION_MESSAGE);
    }

    public void kirimNotifikasiPengembalian() {
        String notifMessage = "Notifikasi Pengembalian - ID: " + id + "\n"
                + "Tanggal: " + tanggal + "\n"
                + "Pesan: " + pesan + "\n"
                + "Dikirim kepada Anggota: " + anggota.getNama() + "\n"
                + "";
        JOptionPane.showMessageDialog(null, notifMessage, "Notifikasi Pengembalian", JOptionPane.INFORMATION_MESSAGE);
    }
}
