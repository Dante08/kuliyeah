package polymorphism;
import java.util.Scanner;
public class Polymorphism {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan jumlah bilangan : ");
       int bil = input.nextInt();
       int bilangan[] = new int [bil];
       int max, min, sum;
       for(int i=0;i<bil;i++) {
           System.out.print("Bilangan ke - "+(i+1)+" : ");
           bilangan[i] = input.nextInt();
       }
       max=bilangan[0];
       min=bilangan[0];
       sum=0;
       System.out.print("\nDeret Bilangan : ");
       for(int i=0;i<bil;i++) {
       System.out.print(bilangan[i]+" ");
      if(bilangan[i]>max)
          max = bilangan[i];
      else if (bilangan[i]<min)
          min = bilangan[i];
      sum = sum+bilangan[i];
    }
    
    Overriding m;
    NilaiMaksimal1 maxx1 = new NilaiMaksimal1 ();
    m = maxx1;
    m.nilai();
    
    Overload mm;
    NilaiMaksimal2 maxx2 = new NilaiMaksimal2();
    maxx2.TampilMaksimal(max);
}
}