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

<form action="">
		
		Nama: <input type="text" name="nama" value="Nama"><br>
		NPM:<input type="password" name="password" value="Password"><br>
		<input type="submit" name="Submit" value="Simpan" placeholder="Simpan">
	</form>
	
			<select>
				<option value="1">1</option>
				<option value="2">2</option>
			</select>
		</tr>
		<tr>
			<td colspan="3" align="left">
				<input type="submit" name="simpan" value="Simpan" placeholder="simpan">
			</td>
		</tr>