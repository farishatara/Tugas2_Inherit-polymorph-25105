package soal1;

/**
 * Merepresentasikan satu perangkat elektronik yang dijual di toko.
 * Kelas ini menyimpan data dasar perangkat dan memastikan setiap
 * nilai yang disimpan lolos validasi.
 */
public class Perangkat {
    /** Tarif pajak perangkat sebesar 10 persen dari harga. */
    private static final double TARIF_PAJAK = 0.10;

    private final String merek;
    /** Dibuat protected agar subclass dapat membaca harga secara langsung. */
    protected double harga;
    private final int garansiBulan;

    /**
     * Membuat perangkat baru.
     *
     * @param merek        merek perangkat, tidak boleh kosong
     * @param harga        harga perangkat, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan, tidak boleh negatif
     * @throws IllegalArgumentException jika merek kosong, harga negatif, atau garansi negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.isBlank()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif: " + harga);
        }
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi tidak boleh negatif: " + garansiBulan);
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengambil merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengambil lama garansi perangkat.
     *
     * @return garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat berdasarkan tarif pajak yang berlaku.
     *
     * @return nilai pajak dalam rupiah
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Menyusun ringkasan satu baris tentang perangkat.
     *
     * @return teks berisi merek dan lama garansi
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
