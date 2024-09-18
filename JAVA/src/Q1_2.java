import java.util.Scanner;

public class Q1_2 {
	public static void main (String[] srgv) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int week = day/7;
		day = day%7;
		System.out.print(week+"週"+day+"天");
	}
}
