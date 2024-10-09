import java.util.Scanner;

public class Segitiga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int alas, tinggi;
        float luas;
        
       
        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        
        
        luas = (float) (alas * tinggi / 2.0); 
        
        
        System.out.println("Luas segitiga: " + luas);
        
        sc.close(); 
    }
}
