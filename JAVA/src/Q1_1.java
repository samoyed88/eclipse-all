import java.util.Scanner;

public class Q1_1 {
	public static void main (String[] srgv) {
		Scanner sc = new Scanner(System.in);
		double Celsius,Fahrenheit;
		Celsius = sc.nextDouble();
		Fahrenheit = Celsius*9/5+32;
		double f = Math.round(Fahrenheit*100.0)/100.0;
		System.out.print("攝氏"+(int)Celsius+"度等於"+"華氏"+(int)f+"度");
	}
}
