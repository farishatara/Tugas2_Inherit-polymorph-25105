package soal2;

/**
 * Superclass hewan untuk latihan urutan constructor dan polimorfisme.
 */
class Hewan {
    protected String nama;

    /**
     * Membuat hewan dan mencetak pesan pembuatan.
     *
     * @param nama nama hewan
     */
    Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /** Mencetak suara generik hewan. */
    void suara() {
        System.out.println("...");
    }

    /** Mencetak aktivitas makan lalu memanggil {@link #suara()}. */
    void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
