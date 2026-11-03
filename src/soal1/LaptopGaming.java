package soal1;

/**
 * Merepresentasikan laptop gaming, yaitu laptop dengan kartu grafis khusus
 * dan garansi tambahan.
 */
public class LaptopGaming extends Laptop {
    /** Tambahan garansi khusus laptop gaming, dalam bulan. */
    private static final int GARANSI_TAMBAHAN_BULAN = 6;

    private final String kartuGrafis;

    /**
     * Membuat laptop gaming baru. Garansi otomatis ditambah enam bulan.
     *
     * @param merek           merek laptop
     * @param harga           harga laptop
     * @param garansiBulan    garansi dasar dalam bulan, sebelum tambahan
     * @param ramGb           kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis     nama kartu grafis
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb,
                        double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN_BULAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menyusun ringkasan laptop gaming, melanjutkan ringkasan dari Laptop.
     *
     * @return teks ringkasan laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
