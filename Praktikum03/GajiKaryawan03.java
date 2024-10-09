import java.util.Scanner;

public class GajiKaryawan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total jam kerja: ");
        double jamKerja = sc.nextDouble();
        double upahPerJam = 7777;

        double gajiSebelumPajak = jamKerja * upahPerJam;
        double bonus = gajiSebelumPajak * 0.10;
        double gajiSetelahBonus = gajiSebelumPajak + bonus;
        double pajak = gajiSetelahBonus * 0.05;
        double gajiBersih = gajiSetelahBonus - pajak;

        System.out.println("Gaji Sebelum Pajak: Rp " + gajiSebelumPajak);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Gaji Setelah Bonus: Rp " + gajiSetelahBonus);
        System.out.println("Gaji Dipotong Pajak: Rp " + pajak);
        System.out.println("Total Gaji Bersih: Rp " + gajiBersih);

        sc.close();
    }
}
