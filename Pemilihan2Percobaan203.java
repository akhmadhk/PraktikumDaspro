package Praktikum06;
import java.util.Scanner;

public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner input3 = new Scanner(System.in);

        int pilihanmenu;
        String member;
        String jenisPembayaran;
        double diskon = 0;
        double harga = 0;
        double totalBayar;
        int potonganQRIS = 1000;

        System.out.println("_______________________");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("_______________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihanmenu = input3.nextInt();
        System.out.print("Apakah punya member (y/n)? ");
        member = input3.next();
        input3.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan jenis pembayaran (QRIS/tunai): ");
        jenisPembayaran = input3.nextLine();
        System.out.println("_____________________________________");

        if (member.equalsIgnoreCase("y")) { 
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (member.equalsIgnoreCase("n")) { 
            diskon = 0;
            System.out.println("Besar diskon = 0%");
        } else {
            System.out.println("Member tidak valid");
            input3.close();
            return;
        }  

        if (pilihanmenu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);    
        } else if (pilihanmenu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);                
        } else if (pilihanmenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            input3.close();
            return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
        }

        // Menghitung total bayar setelah diskon
        totalBayar = harga - (harga * diskon);

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= potonganQRIS;
            System.out.println("Pembayaran menggunakan QRIS, potongan 1.000 diterapkan.");
        }

        System.out.println("Total bayar setelah diskon = " + totalBayar);
        System.out.println("_____________________________________");

        input3.close();
    }
}
