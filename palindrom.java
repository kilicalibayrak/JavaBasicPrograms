import java.util.Scanner;


public class palindrom {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
            System.out.println("Bir kelime giriniz: ");
            String k=giris.nextLine();
            String k2=new StringBuilder(k).reverse().toString();
            if(k.equals(k2))
            System.out.println(k+" kelimesi bir palindromdur.");
            else
            System.out.println(k+" kelimesi bir palindrom değildir.");

        }
    }
}
