package soal2;

/**
 * Subclass Hewan yang bersuara meong dan bisa memanjat.
 */
class Kucing extends Hewan {
    /**
     * Membuat kucing dan mencetak pesan pembuatan.
     *
     * @param nama nama kucing
     */
    Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /** Mencetak suara kucing (meng-override suara milik Hewan). */
    @Override
    void suara() {
        System.out.println("meong");
    }

    /** Mencetak aktivitas memanjat, hanya dimiliki Kucing. */
    void panjat() {
        System.out.println(nama + " memanjat");
    }
}
