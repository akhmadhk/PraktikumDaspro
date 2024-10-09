package Praktikum06;
import java.util.Scanner;

public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double harga;
        double diskon;
        double total_bayar;

        System.out.println("_______________________");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("_______________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc3.nextInt();
        sc3.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc3.nextLine();
        System.out.println("_____________________________________");
        sc3.close();
        if (member.equalsIgnoreCase("y")) { 
            // Membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);    
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bunling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilahan salah
            }

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);   
        }
        else if (member.equalsIgnoreCase("n")) {  //
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga bunling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah

            }
            // Menghitung total bayar
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("Member tidak valid");
    }   
}
