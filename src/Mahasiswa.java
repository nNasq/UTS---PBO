public class Mahasiswa {
    private String nim;
    private String nama;
    private double nilaiProses;
    private double nilaiProduk;
    private double nilaiPresentasi;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiProses = 0;
        this.nilaiProduk = 0;
        this.nilaiPresentasi = 0;
    }

    private boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public void setNilaiProses(double nilai) {
        if (isNilaiValid(nilai)) {
            this.nilaiProses = nilai;
        } else {
            System.out.println("Nilai proses tidak valid. Harus antara 0 hingga 100.");
        }
    }

    public void setNilaiProduk(double nilai) {
        if (isNilaiValid(nilai)) {
            this.nilaiProduk = nilai;
        } else {
            System.out.println("Nilai produk tidak valid. Harus antara 0 hingga 100.");
        }
    }

    public void setNilaiPresentasi(double nilai) {
        if (isNilaiValid(nilai)) {
            this.nilaiPresentasi = nilai;
        } else {
            System.out.println("Nilai presentasi tidak valid. Harus antara 0 hingga 100.");
        }
    }

    public double hitungNilaiAkhir() {
        return (nilaiProses * 0.30) + (nilaiProduk * 0.45) + (nilaiPresentasi * 0.25);
    }

    public boolean cekKelulusan() {
        return hitungNilaiAkhir() >= 70 && nilaiProduk >= 60;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Proses: " + nilaiProses);
        System.out.println("Nilai Produk: " + nilaiProduk);
        System.out.println("Nilai Presentasi: " + nilaiPresentasi);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        if (cekKelulusan()) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Gagal");
        }
    }
}
