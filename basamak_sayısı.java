//BASAMAK SAYISI HESAPLATMA
import java.util.Scanner;

public class basamak_sayısı {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
            System.out.println("Bir sayı giriniz: ");
            int x=giris.nextInt();
            String sayı= Integer.toString(x);
            System.out.println("Basamak sayısı: "+sayı.length());
        }
    }
}
