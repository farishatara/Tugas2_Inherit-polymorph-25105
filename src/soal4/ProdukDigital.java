package soal4;

/**
 * Produk digital yang mendapat diskon tetap dari harga dasar.
 */
public class ProdukDigital extends Produk {
    /** Diskon produk digital sebesar 10 persen. */
    private static final double DISKON_DIGITAL = 0.10;

    private final double ukuranMb;

    /**
     * Membuat produk digital.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb   ukuran berkas dalam MB, tidak boleh negatif
     * @throws IllegalArgumentException jika data tidak valid
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran tidak boleh negatif: " + ukuranMb);
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir: harga dasar dikurangi diskon digital.
     *
     * @return harga akhir dalam rupiah
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() - getHargaDasar() * DISKON_DIGITAL;
    }

    /**
     * Memberi keterangan jenis dan ukuran produk.
     *
     * @return teks seperti "digital 20.0 MB"
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
