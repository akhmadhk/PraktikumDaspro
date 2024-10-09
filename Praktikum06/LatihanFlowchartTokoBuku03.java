package Praktikum06;
import java.util.Scanner;

public class LatihanFlowchartTokoBuku03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hari, jenisBuku;
        int jumlahBuku;
        float diskon = 0, totalDiskon = 0;

        System.out.print("Masukkan hari: ");
        hari = scanner.nextLine();

        if (hari.equalsIgnoreCase("rabu")) {
            System.out.print("Masukkan jenis buku: ");
            jenisBuku = scanner.nextLine();
            System.out.print("Masukkan jumlah buku: ");
            jumlahBuku = scanner.nextInt();

            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                } else {
                    System.out.println("Tidak mendapatkan diskon");
                }
            }
        } else {
            System.out.println("Tidak mendapatkan diskon");
        }

        totalDiskon = diskon;
        System.out.println("Total diskon: " + totalDiskon + "%");

        scanner.close();
    }
}
