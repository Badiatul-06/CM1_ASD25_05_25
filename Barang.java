public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    public Barang(String kodeBarang, String nama, String kategori, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilBarang() {
        System.out.println("Kode Barang      : " + kodeBarang);
        System.out.println("Nama Barang      : " + nama);
        System.out.println("Kategori Barang  : " + kategori);
        System.out.println("Stok Barang      : " + stok);
        System.out.println("Harga Barang     : Rp" + harga);
    }
}
