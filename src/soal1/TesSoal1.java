package soal1;

/**
 * Program uji untuk Soal 1 (hierarki perangkat elektronik).
 */
public class TesSoal1 {
    /**
     * Titik masuk program.
     *
     * @param args tidak dipakai
     */
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Asus", 8000000, 24, 16, 14.0);
        Ponsel ponsel = new Ponsel("Samsung", 5000000, 12, 128, 3);
        LaptopGaming laptopGaming = new LaptopGaming("MSI", 15000000, 12, 32, 15.6, "RTX 4060");

        System.out.println(laptop.infoSingkat());
        System.out.println(ponsel.infoSingkat());
        System.out.println(laptopGaming.infoSingkat());
        System.out.printf("Pajak laptop: Rp%.0f%n", laptop.hitungPajak());
        System.out.printf("Promo laptop 10 persen: Rp%.0f%n", laptop.hitungHargaPromo(10));

        try {
            new Ponsel("", 1000000, 12, 64, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi merek berhasil: " + e.getMessage());
        }
        try {
            new Ponsel("Xiaomi", -1, 12, 64, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi harga berhasil: " + e.getMessage());
        }
    }
}
