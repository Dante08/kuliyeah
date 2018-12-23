package beratmasaindex;
import java.util.Scanner;
/**
 *
 * @author Muhammad Bella BN
 * @NPM 1707051018
 */
public class BeratMasaIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double tinggi_badan;
        double berat_badan;
        double berat_masa_index;
             
        System.out.println("Program Sederhana Menghitung Berat Masa Index");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan Berat Badan = ");
                berat_badan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (cm) = ");
                tinggi_badan = input.nextDouble();
                tinggi_badan /=100;
        
        
        //Menghitung Berat Massa Index
        System.out.print("Berat Massa Index ");
            
            berat_masa_index = berat_badan/ (tinggi_badan*tinggi_badan);
        
        //Hasil Berat Massa Index
        if (berat_masa_index < 18.5) {
                  System.out.print(""+berat_masa_index);
                  System.out.println(" anda terlalu kurus");
        }
                  
            else if ((18.5 <= berat_masa_index) && (berat_masa_index <= 25.0)) {
                    System.out.print(""+berat_masa_index);
                    System.out.println(" anda normal");              
            }
                       else if((25.0 <= berat_masa_index) && (berat_masa_index <= 30.0)) {
                            System.out.print(""+berat_masa_index);
                            System.out.println(" anda terlalu berlebih");
                       }
                               else if (berat_masa_index <= 30.0) {
                                   System.out.print(""+berat_masa_index);
                                   System.out.println(" anda obesitas");
                               }
                                    else {
                                        System.out.print("Tidak didefinisikan");
                               }
               }
        
    }