package Praktikum06;

import java.util.Scanner;

public class LatihanFlowchart1b03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan1, bilangan2, bilangan3, max;

        System.out.print("Masukkan bilangan 1: ");
        bilangan1 = sc.nextInt();

        System.out.print("Masukkan bilangan 2: ");
        bilangan2 = sc.nextInt();

        System.out.print("Masukkan bilangan 3: ");
        bilangan3 = sc.nextInt();

        sc.close();

        // Inisialisasi max dengan bilangan1 sebagai nilai awal
        max = bilangan1;

        // Perbandingan untuk menemukan bilangan terbesar
        if (bilangan2 > max) {
            max = bilangan2;
        }
        if (bilangan3 > max) {
            max = bilangan3;
        }

        System.out.println("Bilangan terbesar adalah: " + max);
        
    }
}
