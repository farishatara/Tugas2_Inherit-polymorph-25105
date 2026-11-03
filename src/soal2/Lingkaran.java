package soal2;

/**
 * Merepresentasikan lingkaran dengan jari-jari tertentu.
 */
class Lingkaran {
    private final double jariJari;

    /**
     * Membuat lingkaran.
     *
     * @param jariJari jari-jari lingkaran
     */
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
