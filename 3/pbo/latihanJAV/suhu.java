import java.util.Scanner;
class fahrenheit_ke_celcius{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double suhu_celcius, fahrenheit;
		System.out.print ("Program konversi suhu Fahrenheit ke Celcius!"+'\n');
		System.out.print ("Masukan suhu Fahrenheit : ");
		fahrenheit = input.nextDouble();
		suhu_celcius = (5.0/9.0)*(fahrenheit-32.0);
		System.out.println ("Suhu nya adalah : "+suhu_celcius);
		
	}
}
