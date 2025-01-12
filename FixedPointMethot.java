import java.util.Scanner;

//f(x)= x^2 -3*x +2
public class FixedPointMethot {

    public static double f(double x) {
        return (Math.pow(x,2)+2)/3;
    }

    public static void main(String[] args) {
        try(Scanner giris= new Scanner(System.in)) {
            double x;
            System.out.println("Initial guess: ?");
            double x0=giris.nextDouble();
            System.out.println("üst hata sınırı ?");
            double beta=giris.nextDouble();
            System.out.println("iterasyon üst sınır=?");
            int n = giris.nextInt();

            for(int i=1; i<=n; i++) {
                x=f(x0);
                System.out.println("x= "+ x);
                if(Math.abs(x-x0)<=beta) {
                    System.out.println("KÖK= " + x);
                    System.exit(0);
                }
                else x0=x;

            }

        }

    }
}