public class PeralatanDemo {
    public static void main(String[] args) {
        Peralatan peralatan1 = new Peralatan("Laptop", 10);
        Peralatan peralatan2 = new Peralatan("Proyektor", 5);
        Peralatan peralatan3 = new Peralatan("Kamera", 20);

        System.out.println("\n=== Data Awal Peralatan ===");
        peralatan1.tampilkanInfo();
        peralatan2.tampilkanInfo();
        peralatan3.tampilkanInfo();

        System.out.println("\n=== Meminjam Peralatan ===");
        // berhasil
        peralatan1.pinjam(4);
        System.out.println("");
        // gagal, stok tidak mencukupi
        peralatan2.pinjam(10);
        System.out.println("");
        // gagal, jumlah pinjam tidak valid
        peralatan3.pinjam(0);

        System.out.println("\n=== Pengembalian Peralatan ===");
        // berhasil
        peralatan1.kembalikan(2);
        System.out.println("");
        // gagal, melebihi jumlah yang dipinjam
        peralatan1.kembalikan(5);

        System.out.println("\n=== Data Akhir Peralatan ===");
        peralatan1.tampilkanInfo();

        peralatan2.tampilkanInfo();
        peralatan3.tampilkanInfo();
    }
}
