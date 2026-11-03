package soal4;

/**
 * Superclass semua produk di toko digital. Menyimpan kode, nama, dan harga dasar,
 * serta mendefinisikan aturan harga akhir dan deskripsi yang dapat di-override.
 */
public class Produk {
    private final String kode;
    private final String nama;
    private final double hargaDasar;

    /**
     * Membuat produk baru.
     *
     * @param kode       kode unik produk, tidak boleh kosong
     * @param nama       nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar, tidak boleh negatif
     * @throws IllegalArgumentException jika kode atau nama kosong, atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif: " + hargaDasar);
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil harga dasar produk.
     *
     * @return harga dasar
     */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /**
     * Menghitung harga akhir produk. Untuk produk umum sama dengan harga dasar.
     *
     * @return harga akhir dalam rupiah
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Memberi keterangan jenis produk.
     *
     * @return keterangan produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
