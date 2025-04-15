public class ServiceClass {
    TransaksiPembelian[] Trs = new TransaksiPembelian[5];
    Barang[] Brg = new Barang[5];
    int index;

    void tambahDataBarang(Barang br){
        if (index < Brg.length) {
            Brg[index] = br;
            index++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampilBarang(){
        for (Barang barang : Brg) {
            barang.tampilBarang();
            System.out.println("----------------------------------------");
        }
    }

    void tambahDataTransaksi(TransaksiPembelian trp){
        if (index < Trs.length) {
            Trs[index] = trp;
            index++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampilTransaksi(){
        for (TransaksiPembelian transaksi : Trs) {
            transaksi.tampilDataTransaksi();
            System.out.println("----------------------------------------");
        }
    }

    int searching(String cari){
        int posisi = -1;
        for (int i = 0; i < Trs.length; i++) {
            if (Trs[i].kodeTransaksi.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String x, int pss){
        if (pss != -1) {
            System.out.println("Data Transaksi dengan Kode '" + x + "' Ditemukan pada Indeks " + pss);
                System.out.println("Kode transaksi      : " + Trs[pss].kodeTransaksi);
                System.out.println("Nama pembeli        : " + Trs[pss].namaPembeli);
                System.out.println("Tanggal pembelian   : " + Trs[pss].tanggalPembelian);
                System.out.println("Jumlah              : " + Trs[pss].qty);
                System.out.println("Barang              : " + Trs[pss].barang);
        } else {
            System.out.println("Kode '" + x + "' Tidak Ditemukan");
        }
    }

    void sorting() {
        for (int i = 0; i < Trs.length - 1; i++) {
            for (int j = 0; j < Trs.length - i - 1; j++) {
                if (Trs[j] != null && Trs[j + 1] != null) {
                    if (Trs[j].kodeTransaksi.compareToIgnoreCase(Trs[j + 1].kodeTransaksi) > 0) {
                        TransaksiPembelian temp = Trs[j];
                        Trs[j] = Trs[j + 1];
                        Trs[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Data transaksi berhasil diurutkan berdasarkan kode transaksi.");
    }
    
    void tampilSemuaTransaksi() {
        for (int i = 0; i < Trs.length; i++) {
            if (Trs[i] != null) {
                System.out.println("\nData ke-" + (i + 1));
                Trs[i].tampilDataTransaksi();
            }
        }
    }
    
}
