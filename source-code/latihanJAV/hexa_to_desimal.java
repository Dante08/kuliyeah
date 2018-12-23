import java.util.Scanner;
public class hexa_to_desimal {
	public static void main (String[] args) {
		// @ author Muhammad Bella BN
		// @ NPM 1707051018
		Scanner input = new Scanner (System.in);
		System.out.print("Program Konversi Hexadesimal to Desimal"+'\n');
	System.out.print("-------------------------------------"+'\n');
		System.out.print("Masukkan Bilangan Hexadesimal : ");
		String hexadec = input.nextLine();
		System.out.println("Nilai Decimal dari " 
			+ hexadec + " adalah " + hexa2dec(hexadec.toUpperCase()));
	}

	//Methode konversi dengan looping
	public static int hexa2dec(String hex) {
		int desimal = 0;
		for (int i = 0; i < hex.length(); i++) {

			/**method charAt() untuk mengembalikan nilai char pada suatu index */
			char hexChar = hex.charAt(i);
			desimal = desimal * 16 + hexChartoDesimal(hexChar);
		}
		return desimal;
	}

	public static int hexChartoDesimal (char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else 
			return ch - '0';
	}
}
