import java.util.Scanner;

public class Q1_3 {
	public static void main (String[] argv) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = c = sc.nextInt();
		b  = sc.nextInt();
		a = b;
		b = c;
		System.out.print(a+" "+b);
	}
	
}
