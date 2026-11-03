package soal1;

/**
 * Merepresentasikan ponsel, yaitu perangkat dengan kapasitas penyimpanan dan kamera.
 */
public class Ponsel extends Perangkat {
    private final int kapasitasGb;
    private final int jumlahKamera;

    /**
     * Membuat ponsel baru.
     *
     * @param merek        merek ponsel
     * @param harga        harga ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb  kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menyusun ringkasan ponsel, melanjutkan ringkasan dari superclass.
     *
     * @return teks ringkasan ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
}
