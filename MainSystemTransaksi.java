import java.util.Scanner;
    public class MainSystemTransaksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceClass service = new ServiceClass();

        // Data Barang
        Barang brg1 = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang brg2 = new Barang("Br002", "You C1000 Botol", "Minuman", 10, 7000);
        Barang brg3 = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang brg4 = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang brg5 = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);
        service.tambahDataBarang(brg1);
        service.tambahDataBarang(brg2);
        service.tambahDataBarang(brg3);
        service.tambahDataBarang(brg4);
        service.tambahDataBarang(brg5);

        // Data Transaksi
        TransaksiPembelian tr1 = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, brg1);
        TransaksiPembelian tr2 = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, brg2);
        TransaksiPembelian tr3 = new TransaksiPembelian("Tr003", "Siska", "23-04-2024", 3, brg3);
        TransaksiPembelian tr4 = new TransaksiPembelian("Tr004", "MeiMei", "23-04-2024", 1, brg3);
        TransaksiPembelian tr5 = new TransaksiPembelian("Tr005", "Ihsan", "24-04-2024", 1, brg2);
        service.tambahDataTransaksi(tr1);
        service.tambahDataTransaksi(tr2);
        service.tambahDataTransaksi(tr3);
        service.tambahDataTransaksi(tr4);
        service.tambahDataTransaksi(tr5);

        // Menu
        while (true) {
            System.out.println("\n--------------Toko Manasuka-------------");
            System.out.println("MENU :");   
            System.out.println("1. Tampilkan Data Barang");
            System.out.println("2. Tampilkan Data Transaksi");
            System.out.println("3. Pencarian Data Transaksi");
            System.out.println("4. Pengurutan Data Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                service.tampilBarang();
            } else if (pilih == 2) {
                service.tampilTransaksi();
            } else if (pilih == 3) {
                System.out.print("Masukkan Kode Transaksi yang Dicari: ");
                String kode = sc.nextLine();
                double posisi = service.searching(kode);
                int pss = (int) posisi;
                service.tampilPosisi(kode, pss);
            } else if (pilih == 4) {
                service.sorting();
                System.out.println("Data transaksi setelah diurutkan secara descending");
                service.tampilTransaksi();
            }else if (pilih == 5) {;
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
