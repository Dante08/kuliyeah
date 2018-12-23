import java.util.Scanner;
public class tes {
	public static void main(String[] args) {
		System.out.println("Program mengurutkan data tinggi badan");
		int jml_data;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah data tinggi badan : ");
		jml_data = input.nextInt();
		int data[] = new int[jml_data];
		System.out.println("");
		for (int i = 0; i < jml_data; i++) {
			System.out.printf("Masukkan data tinggi badan (cm) ke -%d: ",(i+1));
			data[i] = input.nextInt();
		}
		for (int x = 0; x < jml_data - 1; x++) {
			for (int i = 0; i < jml_data - 1; i++)
			{
				if (data[i] < data[i+1]) {
					int j = data[i];
					data[i] = data[i+1];
					data[i+1] = j;
				}
			}
		}
		System.out.println("");
		System.out.println("Hasil pengurutan data tinggi badan : ");
		for (int a = 0;a < jml_data; a++) {
			System.out.print(data[a]+",");
		}
		System.out.println("");
	}
}