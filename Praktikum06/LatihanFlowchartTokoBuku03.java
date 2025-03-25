package Praktikum06;
import java.util.Scanner;

public class LatihanFlowchartTokoBuku03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku, hari;
        int jumlahBuku;
        double diskon = 0;

        // Input hari
        System.out.print("Hari apa ini: ");
        hari = sc.nextLine();

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        sc.close();
        
        // Diskon hari Rabu
        if (hari.equalsIgnoreCase("rabu")) {
            // Menghitung diskon buku yang dibeli

            // Diskon kamus
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 0.1;
                if (jumlahBuku > 2) {
                    diskon += 0.2;
                }
            // Diskon novel
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
                if (jumlahBuku > 3) {
                    diskon += 0.02;
                } else if (jumlahBuku <= 3) {
                    diskon += 0.01;
                }
            // Diskon buku lainnya
            } else {
                if (jumlahBuku >= 3) {
                    diskon += 0.05;
                } else {
                    System.out.println("Tidak mendapatkan diskon");
                }
            }
            
            // Output hasil perhitungan
            // Agar jumlah persen yang ditampilkan tidak aneh
            double diskonPersen = Math.round(diskon * 100 * 100.0) / 100.0;
            System.out.println("Total diskon: " + diskonPersen + "%");
        } else {
            System.out.println("Bukan hari Rabu, tidak ada diskon");
        }

        sc.close();
    }
}
