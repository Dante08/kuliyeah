import java.util.Scanner;
public class comparasi_nilai{

	//Methode Main
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int bil1, bil2;
	int operasi, pertanyaan;
        
	//Masukkan bilangan yang ingin dijumlahkan
	System.out.print("Program Komparasi nilai true or false"+'\n');
	System.out.print("-------------------------------------"+'\n');
	System.out.print("Masukkan bilangan pertama : ");
		bil1 = input.nextInt();
	System.out.print("Masukkan bilangan kedua   : ");
		bil2 = input.nextInt();

	//Pertanyaan hasil
	System.out.print("Berapa hasil penjumlahan dua bilangan diatas ? : ");
	pertanyaan = input.nextInt();
	operasi = bil1+bil2;

	//benar atau salah
	if (pertanyaan == operasi) {
		System.out.println("Selamat, Anda Benar!");
	}
	else
	{
		System.out.println("Maaf,jawaban anda salah!");
		System.out.println("Hasil sebenarnya adalah : "+operasi);
		}
	
}
}