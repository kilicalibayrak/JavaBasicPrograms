import java.util.Scanner;

public class tek_cift1 {
    public static void main(String[] args) {
         try(Scanner giris=new Scanner(System.in)) {
        System.out.print("n: ");
        int n;
        n =giris.nextInt();
        //n tek sayı toplamı
        int k=0;
        for(int i=1; i<=2*n-1; i=i+2) {
            k=k+i;
            System.out.print(i+" ");
        }
        System.out.println("tek: "+k);
        int m=0;

        //cift sayı toplamı
        for(int i=2;i<=2*n; i=i+2) {
            m=m+i;
            System.out.print(i+" ");
        }
        System.out.println("cift: "+k);
    }
}
}
