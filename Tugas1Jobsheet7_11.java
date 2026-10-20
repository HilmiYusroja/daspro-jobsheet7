import java.util.Scanner;

public class Tugas1Jobsheet7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket= 50000, tiket, totalTiket = 0;
        double hargaPelanggan = 0, total = 0, diskon = 0;

        do {
            System.out.print("Masukkan tiket bioskop yang ingin dibeli (ketik '0' untuk menghentikan perulangan) : ");
            tiket = input.nextInt();

            if (tiket == 0) {
                System.out.println("Penjualan hari ini telah selesai");
                break;
            }

            if (tiket > 4) {
                diskon = (hargaTiket * tiket) * 0.1;
                hargaPelanggan = (hargaTiket * tiket) - diskon;
                total += hargaPelanggan;
                totalTiket += tiket;

                System.out.println("Anda mendapatkan diskon sebesar 10%\nHarga yang harus dibayar : Rp " + hargaPelanggan);
                System.out.println("Total tiket yang terjual : " + totalTiket);
                System.out.println("Total pendapatan hari ini adalah : Rp " + total + "\n");
            } else if (tiket > 10) {
                diskon = (hargaTiket * tiket) * 0.15;
                hargaPelanggan = (hargaTiket * tiket) - diskon;
                total += hargaPelanggan;
                totalTiket += tiket;

                System.out.println("Anda mendapatkan diskon sebesar 15%\nHarga yang harus dibayar : Rp " + hargaPelanggan);
                System.out.println("Total tiket yang terjual : " + totalTiket);
                System.out.println("Total pendapatan hari ini adalah : Rp " + total + "\n");
            } else {
                hargaPelanggan = hargaTiket * tiket;
                total += hargaPelanggan;
                totalTiket += tiket;

                System.out.println("Harga yang harus dibayar : Rp " + hargaPelanggan);
                System.out.println("Total tiket yang terjual : " + totalTiket);
                System.out.println("Total pendapatan hari ini adalah : Rp " + total + "\n");
            }

            hargaPelanggan = 0;
        } while (true);
    }
}