package sistemperpustakaan;

public class Admin {
    private String id;
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public void login() {
        System.out.println("Admin " + nama + " berhasil login.");
        System.out.println("-----------------------------");
    }

    public void logout() {
        System.out.println("Admin " + nama + " berhasil logout.");
        System.out.println("-----------------------------");
    }
}

