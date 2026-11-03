package soal1;

/**
 * Merepresentasikan laptop, yaitu perangkat dengan RAM dan ukuran layar.
 */
public class Laptop extends Perangkat {
    private static final double PERSEN_PENUH = 100.0;

    private final int ramGb;
    private final double ukuranLayarInci;

    /**
     * Membuat laptop baru.
     *
     * @param merek           merek laptop
     * @param harga           harga laptop
     * @param garansiBulan    lama garansi dalam bulan
     * @param ramGb           kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah dipotong diskon.
     *
     * @param diskonPersen besar diskon dalam persen, antara 0 sampai 100
     * @return harga setelah diskon
     * @throws IllegalArgumentException jika diskon di luar rentang 0 sampai 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > PERSEN_PENUH) {
            throw new IllegalArgumentException("Diskon harus 0 sampai 100 persen: " + diskonPersen);
        }
        return harga - (harga * diskonPersen / PERSEN_PENUH);
    }

    /**
     * Menyusun ringkasan laptop, melanjutkan ringkasan dari superclass.
     *
     * @return teks ringkasan laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}
