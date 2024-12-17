//2 MATRİSİN TOPLAMI VE FARKI:
import java.util.Scanner;

public class matris_islemleri1 {
    public static void main(String[] args) {
        
        int t[][]=new int[2][2];
        int k[][]=new int [2][2];
        int topl[][]=new int [2][2];
        int fark[][]=new int [2][2];
        try(Scanner giris=new Scanner(System.in)) {
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("1. Matrise Eleman girin: ");
                t[i][j]=giris.nextInt();
            }
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("2. Matrise Eleman girin: ");
                k[i][j]=giris.nextInt();
            }
        }
        
        //2 matris toplamı
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                topl[i][j]=t[i][j]+k[i][j];
            }

        }
        System.out.println("2 matris toplamı: ");

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(topl[i][j]+" ");
            }
            System.out.println(" ");
        }

        //2 matris farkı:
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                fark[i][j]=t[i][j]-k[i][j];
            } 
        }

        System.out.println("2 matris farkı: ");

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(fark[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
}
