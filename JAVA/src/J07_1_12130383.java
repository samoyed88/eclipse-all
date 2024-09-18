import java.util.Scanner;

public class J07_1_12130383 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary = {3,5,0,3,9,4,1,6,8,4,3};
		int sum=0;
		for(int a:ary) {
			sum+=a;
		}
		System.out.print(sum);
	}

}
