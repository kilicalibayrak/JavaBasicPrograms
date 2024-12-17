import java.util.Scanner;

public class altalta_kelime {
    public static void main(String[] args) {
         try(Scanner giris=new Scanner(System.in)) {
         System.out.print("Kelime: ");
         String x=giris.nextLine();
         for(int i=0;i<x.length();i++) {
            System.out.println(x.charAt(i));
         }
    }
}
}
