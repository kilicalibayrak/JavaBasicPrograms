
import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
            System.out.println("1. sayıyı girin: ");
            int sayı1=giris.nextInt();
            System.out.println("2. sayıyı girin: ");
            int sayı2=giris.nextInt();

            System.out.println("1.+ 2.- 3.* 4./ ");
            int islem=giris.nextInt();
            switch (islem) {
                case 1: 
                System.out.println("Sonuç: "+(sayı1+sayı2));
                break;
                case 2: 
                System.out.println("Sonuç: "+(sayı1-sayı2));
                break;
                case 3: 
                System.out.println("Sonuç: "+(sayı1*sayı2));
                break;
                case 4: 
                if(sayı2==0) 
                System.out.println("0'a bölünemez.");
                else 
                System.out.println("Sonuç: "+(sayı1/sayı2));
                break;
                default:
                System.out.println("Geçersiz Işlem.");
                return;
            }

        }
    }
    
}
