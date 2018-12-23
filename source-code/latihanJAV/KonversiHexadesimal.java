import java.util.Scanner;  
     
public class KonversiHexadesimal {  
           
      
   public static void main(String[] args) {  
           
        Scanner input = new Scanner(System.in);  
           
        /** Membuat prompt untuk memasukkan hexadesimal */ 
        System.out.print("Masukkan angka hexadesimal: ");  
           
        /** Input hexadesimal adalah dalam bentuk String */ 
        String hexadecimal = input.nextLine();  
           
        /** Menampilkan nilai desimal setelah dikonversi dari hexadesimal  
        dengan memanggil method konversiHexadecimal  
        nilai yang diinput bisa berupa lowercase atau uppercase  
        namun semuanya diubah menjadi uppercase menggunakan .toUppercase   
        sebelum method konversiHexadecimal dipanggil */
        System.out.println("Nilai desimal untuk angka hexadesimal " 
        + hexadecimal + " adalah " + konversiHexadecimal(hexadecimal.toUpperCase()));  
        }  
      
   /** Method untuk mengkonversi hexadesimal menggunakan loop */ 
   public static int konversiHexadecimal(String hex) {  
           
        int nilaiDesimal = 0;  
           
        for (int i = 0; i < hex.length(); i++) {  
                
             /**method charAt() digunakan untuk  
             mengembalikan nilai char pada index tertentu */ 
             char hexChar = hex.charAt(i);  
             nilaiDesimal = nilaiDesimal * 16 + hexCharKeDesimal(hexChar);  
             }  
        /** mengembalikan nilai desimal */
        return nilaiDesimal;  
           
   }  
      
   /** Method untuk mengembalikan nilai desimal dari hex character */ 
   public static int hexCharKeDesimal(char ch) {  
        if (ch >= 'A' && ch <= 'F')  
             return 10 + ch - 'A';  
        else // ch adalah '0', '1', ..., atau '9'  
             return ch - '0';  
        }  
}