//FAKTORİYEL 
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
        System.out.println("Sayı: ");
        int n=giris.nextInt();
        int fakt=1;
        for(int i=1;i<=n;i++) {
            fakt=fakt*i;
        }
        System.out.println("Faktoriyel: "+fakt);
        
    }
}
}
