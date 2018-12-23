package tabel.perkalian;
/**
 *
 * @author Muhammad Bella BN
 */
import java.util.Scanner;
public class TabelPerkalian {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Tabel Perkalian Sederhana");
        System.out.println ("-------------------------------");
        System.out.print ("Masukkan sebuah angka (1-10) = ");
        
        int range = input.nextInt();
        System.out.println("Tabel perkalian "+range);
        for (int angka=0; angka<10; angka++) {
            System.out.println(range+" x "+(angka+1)+" = "+
            (range*(angka+1)));
        }
    }
    
}
