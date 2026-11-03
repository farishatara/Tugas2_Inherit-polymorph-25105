package soal2;

/**
 * Program uji untuk Soal 2 (analisis output, error, dan polimorfisme).
 */
public class TesSoal2 {
    /**
     * Titik masuk program. Menjalankan Bagian A, B, dan C secara berurutan.
     *
     * @param args tidak dipakai
     */
    public static void main(String[] args) {
        System.out.println("=== Bagian A ===");
        jalankanBagianA();
        System.out.println("=== Bagian B ===");
        new B();
        System.out.println("=== Bagian C ===");
        jalankanBagianC();
    }

    /**
     * Menjalankan Bagian A. ClassCastException ditangkap agar Bagian B dan C tetap berjalan,
     * lalu ditunjukkan perbaikan dengan instanceof.
     */
    private static void jalankanBagianA() {
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // error kompilasi: tipe statis Hewan tidak punya panjat()
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        try {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        if (h2 instanceof Kucing) {
            ((Kucing) h2).panjat();
        } else {
            System.out.println("h2 bukan Kucing, downcasting dibatalkan");
        }
    }

    /** Menjalankan Bagian C: polimorfisme pada Lingkaran dan Titik. */
    private static void jalankanBagianC() {
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
