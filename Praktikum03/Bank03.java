import java.util.Scanner;

public class Bank03 {
    public static void main(String[] args) {
       
        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga = 0.0002;
        int lamaMenabung;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah tabungan awal: ");
        tabunganAwal = scanner.nextDouble();
        System.out.print("Masukkan lama menabung (bulan): ");
        lamaMenabung = scanner.nextInt();

        
        bunga = persentaseBunga * lamaMenabung * tabunganAwal;

        
        tabunganAkhir = tabunganAwal + bunga;

        
        System.out.println("Bunga: Rp " + bunga);
        System.out.println("Tabungan akhir: Rp " + tabunganAkhir);

        scanner.close(); 
    }
}