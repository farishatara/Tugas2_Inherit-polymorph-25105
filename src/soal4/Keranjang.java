package soal4;

import java.util.ArrayList;

/**
 * Keranjang belanja yang menyimpan daftar {@link Produk} (composition).
 */
public class Keranjang {
    private final ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang ditambahkan, tidak boleh null
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException    jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }
        if (sudahAda(produk.getKode())) {
            throw new IllegalStateException("Kode produk sudah ada di keranjang: " + produk.getKode());
        }
        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga akhir seluruh produk. Perilaku tiap produk
     * ditentukan secara polimorfis, tanpa instanceof.
     *
     * @return total harga dalam rupiah
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak struk berisi satu baris per produk dan total keseluruhan.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n", produk.getKode(), produk.getNama(),
                    produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung dan mencetak jumlah produk fisik, digital, dan langganan.
     * Pengecekan Langganan harus lebih dulu karena Langganan juga ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;
        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                jumlahFisik++;
            }
        }
        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }

    private boolean sudahAda(String kode) {
        for (Produk produk : daftarProduk) {
            if (produk.getKode().equals(kode)) {
                return true;
            }
        }
        return false;
    }
}
