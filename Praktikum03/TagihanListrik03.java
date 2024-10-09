import java.util.Scanner;

public class TagihanListrik03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penggunaan listrik dalam KWH: ");
        double penggunaanListrik = scanner.nextDouble();
        
        int tarifPerKwh = 1500;
        
        double totalTagihan = penggunaanListrik * tarifPerKwh;

        boolean melebihi500Kwg = penggunaanListrik > 500;

        System.out.println("Total biaya listrik: Rp " + totalTagihan);

        if (melebihi500Kwg) {
            System.out.println("Penggunaan listrik melebihi 500KWH. ");
        }
        else {
            System.out.println("Penggunaan listrik tidak melebihi 500KWH. ");
        }
    scanner.close();
    }
}