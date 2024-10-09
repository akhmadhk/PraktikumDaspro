package Praktikum05;
import java.util.Scanner;

public class Kafe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.println("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.println("Masukkan ukuran cup: ");
        ukuranCup = sc.nextLine().charAt(0);
        System.out.println("Masukkan jumlah");
        jumlah= sc.nextInt();
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
        
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;    
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominal = totalHarga - (diskon * totalHarga);

       System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup" + ukuranCup );
       System.out.println("Nominal bayar: " + nominal);

       sc.close();
    }
}
