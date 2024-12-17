//TOPLAM TEK MİDİR CİFT MİDİR?
import java.util.Scanner;

public class tek_cift2 {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
        System.out.println("Bir sayı giriniz: ");
        int n=giris.nextInt();
        int toplam=0;
        for(int i=1;i<=n;i++) {
            toplam=toplam+i;
        }
        System.out.println("Toplam: "+toplam);
        if(toplam%2==0) 
        System.out.println("Çift sayıdır.");
        else
        System.out.println("Tek sayıdır.");
    }
}
}
