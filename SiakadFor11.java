import java.util.Scanner;

public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lulus = 0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + i + " : ");
            nilai = input.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus += 1;
            } else {
                tidakLulus += 1;
            }
        }

        System.out.println("Banyaknya mahasiswa yang lulus : " + lulus);
        System.out.println("Banyak mahasiswa yang tidak lulus : " + tidakLulus);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}
