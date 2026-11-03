package soal3;

/**
 * Program uji untuk Soal 3 (composition, overloading, aliasing, defensive copy).
 */
public class TesSoal3 {
    /**
     * Titik masuk program.
     *
     * @param args tidak dipakai
     */
    public static void main(String[] args) {
        Garis garis = new Garis(0, 0, 3, 4);
        System.out.println(garis + " panjang=" + garis.getPanjang());

        Titik titik = new Titik(1, 1);
        Garis garis2 = new Garis(titik, new Titik(5, 5));
        titik.setX(100);
        System.out.println(garis2);
    }
}
