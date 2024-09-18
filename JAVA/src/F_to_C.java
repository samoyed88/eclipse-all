import java.util.Scanner;

public class F_to_C {
	public static void main (String[] srgv) {
		Scanner sc = new Scanner(System.in);
		double Celsius,Fahrenheit;
		Fahrenheit = sc.nextDouble();
		Celsius = (Fahrenheit-32)*5/9;
		double c = Math.round(Celsius*100.0)/100.0;
		System.out.print("攝氏"+c+"度");
	}
}
