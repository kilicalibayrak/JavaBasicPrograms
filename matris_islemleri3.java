//TEKRAR EDEN SAYILARI YAZDIRMA
import java.util.Scanner;

public class matris_islemleri3 {
    public static void main(String[] args) {
        //eleman sayısı:
        try(Scanner giris=new Scanner(System.in)) {
        System.out.println("Eleman sayısı: ");
        int k=giris.nextInt();
        int matris[]=new int[k];
        //diziye eleman girisi:
        System.out.println("Dizi elemanları:");
        for(int i=0;i<k;i++) {
            matris[i]=giris.nextInt();
        }
        for(int i=0;i<k;i++) {
            System.out.print(matris[i]+ ", ");
        }
        //aynı sayıları yazdırma
        System.out.println();
        System.out.print("Tekrar eden sayılar: ");
        for(int i=0;i<k;i++) {
            for(int j=i+1;j<k;j++) {
                if(matris[i]==matris[j]) {
                    System.out.print(matris[i]+", ");
                }
            }
        }
    }
}
}
