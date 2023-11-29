package sistemperpustakaan;

import java.util.Date;
import javax.swing.JOptionPane;

public class Perpustakaan {

    public static void main(String[] args) {
        Buku bukukuDanbukumu = new Buku("Buku ku dan Buku mu", "M.Rifqi Al Ardabili", "MRAAB001");
        Buku apalagiYa = new Buku("Apalagi ya?", "M.Reza Kurniawan", "MRK001");
        Buku kisahCintaku = new Buku("Kisah Cintaku", "Jhon V Nababan", "JVN001");

        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("M. RIFQI AL ARDABILI", "X01", "Jl. Rw. Monginsidi");

        int choice = -1;
        while (choice != 0) {
            String input = JOptionPane.showInputDialog("Selamat datang di Sistem Informasi Perpustakaan Hijau\n"
                    + "Menu:\n"
                    + "1. Admin\n"
                    + "2. Anggota Perpustakaan\n"
                    + "0. Keluar\n\n"
                    + "Pilihan Anda:");

            choice = Integer.parseInt(input);

            if (choice == 1) {
                memberMenu(anggota1, bukukuDanbukumu, apalagiYa, kisahCintaku);
            } else if (choice == 2) {
                adminMenu(bukukuDanbukumu);
            } else if (choice == 0) {
                JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan sistem informasi perpustakaan hijau.");
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void memberMenu(AnggotaPerpustakaan anggota, Buku buku1, Buku buku2, Buku buku3) {
        int memberChoice = -1;
        while (memberChoice != 0) {
            String input = JOptionPane.showInputDialog("Anggota Perpustakaan\n"
                    + "1. Admin\n"
                    + "2. Anggota Perpustakaan\n"
                    + "0. Keluar\n\n"
                    + "Pilihan Anda:");

            memberChoice = Integer.parseInt(input);

            if (memberChoice == 1) {
                String bookChoices = "Buku yang Tersedia:\n"
                        + "1. " + buku1.getJudulBuku() + "\n"
                        + "2. " + buku2.getJudulBuku() + "\n"
                        + "3. " + buku3.getJudulBuku();

                int bookChoice = Integer.parseInt(JOptionPane.showInputDialog(bookChoices + "\n\nPilih nomor buku yang ingin Anda pinjam:"));

                if (bookChoice >= 1 && bookChoice <= 3) {
                    Buku selectedBook = getSelectedBook(bookChoice, buku1, buku2, buku3);
                    anggota.pinjamBuku(selectedBook, selectedBook.getJudulBuku(), new Date(), 7);
                    JOptionPane.showMessageDialog(null, "Proses Selesai.");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan coba lagi.");
                }
            } else if (memberChoice == 2) {
                String judulKembali = JOptionPane.showInputDialog("Masukkan judul buku yang ingin Anda kembalikan:");
                anggota.kembalikanBuku(buku1, judulKembali, new Date());
                JOptionPane.showMessageDialog(null, "Proses Selesai.");
            } else if (memberChoice == 0) {
                JOptionPane.showMessageDialog(null, "Kembali ke Menu Utama.");
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void adminMenu(Buku buku) {
        int adminChoice = -1;
        while (adminChoice != 0) {
            String input = JOptionPane.showInputDialog("Admin\n"
                    + "1. Menambah Koleksi Buku\n"
                    + "0. Kembali ke Menu Utama\n\n"
                    + "Pilihan Anda:");

            adminChoice = Integer.parseInt(input);

            if (adminChoice == 1) {
                Buku newBook = createBook();
                newBook.tambahKeKoleksi();
                JOptionPane.showMessageDialog(null, "Buku berhasil ditambahkan ke koleksi.");
            } else if (adminChoice == 0) {
                JOptionPane.showMessageDialog(null, "Kembali ke Menu Utama.");
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static Buku createBook() {
        String bookTitle = JOptionPane.showInputDialog("Masukkan judul buku:");
        String bookAuthor = JOptionPane.showInputDialog("Masukkan penulis buku:");
        String bookISBN = JOptionPane.showInputDialog("Masukkan ISBN buku:");

        return new Buku(bookTitle, bookAuthor, bookISBN);
    }

    private static Buku getSelectedBook(int choice, Buku buku1, Buku buku2, Buku buku3) {
        if (choice == 1) {
            return buku1;
        } else if (choice == 2) {
            return buku2;
        } else if (choice == 3) {
            return buku3;
        } else {
            return null;
        }
    }
}
