package soal2;

/**
 * Superclass yang sengaja memanggil method overridable dari constructor
 * untuk memperlihatkan risikonya.
 */
class A {
    /** Membuat A dan memanggil {@link #init()} dari constructor. */
    A() {
        System.out.println("A dibuat");
        init();
    }

    /** Mencetak pesan inisialisasi milik A. */
    void init() {
        System.out.println("init A");
    }
}
