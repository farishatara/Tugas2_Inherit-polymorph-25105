package soal2;

/**
 * Titik yang dimodelkan sebagai lingkaran berjari-jari nol.
 * Dipakai untuk membahas apakah relasi is-a di sini masuk akal.
 */
class Titik extends Lingkaran {
    /** Membuat titik dengan jari-jari nol. */
    Titik() {
        super(0);
    }

    /**
     * Luas titik selalu nol.
     *
     * @return 0.0
     */
    @Override
    double luas() {
        return 0.0;
    }

    /**
     * Keliling titik selalu nol.
     *
     * @return 0.0
     */
    @Override
    double keliling() {
        return 0.0;
    }
}
