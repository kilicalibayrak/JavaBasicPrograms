//DETERMİNANT HESAPLATMA:
import java.util.Scanner;

public class matris_islemleri4 {
    public static void main(String[] args) {
        try(Scanner giris=new Scanner(System.in)) {
        int matris[][]=new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println((i+1)+". Satır "+(j+1)+" .Sutun");
                matris[i][j]=giris.nextInt();
            }
        }
        int det=(matris[0][0]*matris[1][1])-(matris[0][1]*matris[1][0]);
        System.out.println("Determinant: "+det);
    }
}
}
