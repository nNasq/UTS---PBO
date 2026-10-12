public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("25001", "Nanas");
        Mahasiswa mahasiswa2 = new Mahasiswa("25002", "Rafa");
        Mahasiswa mahasiswa3 = new Mahasiswa("25003", "Reffi");

        // set nilai mahasiswa1 lulus
        mahasiswa1.setNilaiProses(80);
        mahasiswa1.setNilaiProduk(85);
        mahasiswa1.setNilaiPresentasi(75);

        // set nilai mahasiswa2 gagal nilai akhir
        mahasiswa2.setNilaiProses(50);
        mahasiswa2.setNilaiProduk(65);
        mahasiswa2.setNilaiPresentasi(50);

        // set nilai mhs3 gagal syarat nilai produk
        mahasiswa3.setNilaiProses(100);
        mahasiswa3.setNilaiProduk(50);
        mahasiswa3.setNilaiPresentasi(100);

        System.out.println("\n === Uji nilai di luar rentang ===");
        mahasiswa1.setNilaiProses(120);
        mahasiswa1.setNilaiProduk(-10);

        System.out.println("\n=== Hasil Akhir ===");
        mahasiswa1.tampilkanInfo();
        System.out.println("");
        mahasiswa2.tampilkanInfo();
        System.out.println("");
        mahasiswa3.tampilkanInfo();
        System.out.println("");
    }
}
