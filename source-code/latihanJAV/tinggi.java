import java.util.Scanner;
/**
 *
 * @author Muhammad Bella BN
 * @NPM 1707051018
 */
public class tinggi {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tinggi_badan;
  
             
        System.out.println("Program Sederhana Menghitung Tinggi Badan");
        System.out.println("---------------------------------------------");
                System.out.print("Masukkan Tinggi Badan (cm) = ");
                tinggi_badan = input.nextInt();
 
            
                   
        if (tinggi_badan >= 170) {
         
                  System.out.println(" Anda Tinggi");
        }
                  
            else if ((150 >= tinggi_badan) && (tinggi_badan == 170)) {
                 
                    System.out.println(" Anda Sedang");              
            }
                             else if (tinggi_badan <= 150) {
                                   
                                   System.out.println(" Anda Pendek");
                               }
                               else {
                               System.out.println("Tidak terdefinisikan");
                               }
                                    
               }
   
    }