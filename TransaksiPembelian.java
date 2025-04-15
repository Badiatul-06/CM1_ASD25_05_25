public class TransaksiPembelian {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    Barang barang;

    TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang barang){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.barang = barang;
    }

    void tampilDataTransaksi(){
        System.out.println("Kode transaksi      : " + kodeTransaksi);
        System.out.println("Nama pembeli        : " + namaPembeli);
        System.out.println("Tanggal pembelian   : " + tanggalPembelian);
        System.out.println("Jumlah              : " + qty);
        System.out.println("Barang              : " + barang);
    }
}
