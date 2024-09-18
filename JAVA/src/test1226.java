import java.util.*;
public class test1226 {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean password=num(sc.nextInt());
		System.out.print(password);
	}
	public static boolean num(int n) {
		if(n==5678)return true;
		else return false;
	}*/
	
	/*public static void main(String[] argv) {
		Scanner sc=new Scanner (System.in);
		int a=num(sc.nextInt(),sc.nextInt());
		System.out.print("output:"+a);
	}
	public static int num(int a,int b) {
		System.out.println("Input :"+a+" "+b);
		if(a==b)return 1;
		else return 0;
	}*/
	/*public static void main(String[] argv) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(num(a));
	}
	public static int num(int n) {
		if(n==0) return 1;
		else return n*num(n-1);
	}*/
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
