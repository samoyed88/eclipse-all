import java.util.*;
public class J07_2_12130383 {

	public static void main(String[] argv) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("input:"+a);
		int b=F(a);
		System.out.print("output:"+b);
	}
	public static int F(int n) {
		if(n==0)return 0;
		else return n+F(n-1);
	}

}
