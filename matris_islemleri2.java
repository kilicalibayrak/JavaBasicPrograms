//  TRANSPOZ HESAPLAMA
import java.util.Scanner;

public class matris_islemleri2 {
    public static void main(String[] args) {
        int matris[][]=new int[3][3];
        int transpoz[][]=new int[3][3];
        try(Scanner giris=new Scanner(System.in)) {
        //matrise sayı girdisi;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.println((i+1)+". satır "+(j+1)+". sutun: ");
                matris[i][j]=giris.nextInt();
            } 
        }
        //transpozunu yazdırcaz
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                transpoz[i][j]=matris[j][i];
            }
        }
        //traspoz yazdırma
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }
        //ana köşegen toplamı;
        int köşegen=0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i==j) { 
                köşegen=matris[i][i]+köşegen; 
                }
            }
        }
        System.out.println("Köşegen toplamı: "+köşegen);
        }
    }
}
