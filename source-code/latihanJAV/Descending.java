import java.util.Scanner;
public class Descending {
    public static void main(String[] args) {
        // 1. Header Program
        System.out.println("*************************************************");
        System.out.println("    PROGRAM JAVA SORTING DESCENDING DGN ARRAY    ");
        System.out.println("*************************************************");
        System.out.println("");

        // 2. Variabel
        int jml_data;
        Scanner input = new Scanner(System.in);

        // 3. Output dan Input dari User
        System.out.print("Masukkan jumlah data: ");
        jml_data = input.nextInt();
        int data[] = new int[jml_data];

        // 4. Proses Perhitungan dan Hasil Output
        System.out.println("");
        for (int i = 0; i < jml_data; i++) {
            System.out.printf("Masukkan data ke-%d: ", (i + 1));
            data[i] = input.nextInt();
        }

        for (int x = 0; x < jml_data - 1; x++) {
            for (int i = 0; i < jml_data - 1; i++) {
                if (data[i] < data[i + 1]) {
                    int j = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil pengurutan bilangan: ");
        for (int a = 0; a < jml_data; a++) {
            System.out.print(data[a] + ", ");
        }
        System.out.println("");

        // 5. Footer
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("  COPYRIGHT BY: RIZKI A. P. - TANGGAL 27/11/2014 ");
        System.out.println("*************************************************");
    }
}