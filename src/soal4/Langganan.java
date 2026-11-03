package soal4;

/**
 * Produk digital berbasis langganan bulanan. Tidak memakai diskon digital,
 * tetapi mendapat diskon langganan jika durasinya cukup panjang.
 */
public class Langganan extends ProdukDigital {
    /** Diskon langganan sebesar 20 persen. */
    private static final double DISKON_LANGGANAN = 0.20;
    /** Durasi minimal (bulan) agar mendapat diskon langganan. */
    private static final int BATAS_DURASI_DISKON_BULAN = 12;

    private final int durasiBulan;

    /**
     * Membuat langganan.
     *
     * @param kode        kode unik produk
     * @param nama        nama produk
     * @param hargaDasar  harga dasar per bulan
     * @param ukuranMb    ukuran berkas dalam MB
     * @param durasiBulan lama langganan dalam bulan, minimal 1
     * @throws IllegalArgumentException jika data tidak valid
     */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan < 1) {
            throw new IllegalArgumentException("Durasi minimal 1 bulan: " + durasiBulan);
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga akhir: harga dasar dikali durasi, dengan diskon
     * langganan jika durasi mencapai batas minimal.
     *
     * @return harga akhir dalam rupiah
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_DURASI_DISKON_BULAN) {
            total -= total * DISKON_LANGGANAN;
        }
        return total;
    }

    /**
     * Memberi keterangan jenis dan durasi langganan.
     *
     * @return teks seperti "langganan 12 bulan"
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
