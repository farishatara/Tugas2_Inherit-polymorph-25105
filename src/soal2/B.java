package soal2;

/**
 * Subclass A yang memiliki field dengan nilai awal dan meng-override init().
 */
class B extends A {
    int nilai = 5;

    /** Membuat B setelah constructor A selesai. */
    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /** Mencetak pesan inisialisasi milik B beserta nilai field. */
    @Override
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
