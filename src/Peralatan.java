public class Peralatan {
    private String nama;
    private int stok;
    private int jumlahPinjam;

    public Peralatan(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
        this.jumlahPinjam = 0;
    }

    public void pinjam(int jumlah) {
        System.out.println("Meminjam " + jumlah + " " + nama);
        if (jumlah <= 0) {
            System.out.println("Jumlah pinjam tidak valid.");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi. Sisa stok: " + stok);
        } else {
            stok -= jumlah;
            jumlahPinjam += jumlah;
            System.out.println("Berhasil meminjam " + jumlah + " " + nama);
        }
    }

    public void kembalikan(int jumlah) {
        System.out.println("Mengembalikan " + jumlah + " " + nama);
        if (jumlah <= 0) {
            System.out.println("Jumlah pengembalian tidak valid.");
        } else if (jumlah > jumlahPinjam) {
            System.out.println("Jumlah pengembalian melebihi jumlah yang dipinjam. Jumlah yang dipinjam: " + jumlahPinjam);
        } else {
            stok += jumlah;
            jumlahPinjam -= jumlah;
            System.out.println("Berhasil mengembalikan " + jumlah + " " + nama);
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Peralatan: " + nama);
        System.out.println("Stok Tersedia: " + stok);
        System.out.println("Jumlah Dipinjam: " + jumlahPinjam);
        System.out.println("");
    }
}