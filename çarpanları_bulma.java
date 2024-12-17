import java.util.Scanner;

public class çarpanları_bulma {
    public static void main(String[] args) {
        //1.soru:
        try(Scanner giris=new Scanner(System.in)) {
        System.out.print("Bir sayı giriniz: ");
        int x=giris.nextInt();
        int k=0;
        System.out.println("Çarpanlar: ");
        for(int i=1;i<=x;i++) {
            if(x % i == 0) {
                System.out.print(i+", ");
                k=k+i;
            }
        }
        System.out.println();
        System.out.println("Toplamı: "+k);
    }

    }
}
