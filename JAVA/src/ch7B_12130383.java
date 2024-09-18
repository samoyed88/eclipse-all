import java.util.*;

public class ch7B_12130383 {

	// 1
	/*
	 public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); boolean t=triangle(a,b,c);
	 if(t)System.out.println("可以成為三角形"); else System.out.println("不可以成為三角形");
	 }
	 public static boolean triangle(int a,int b,int c) { if(a+b>c && b+c>a &&
	 c+a>b)return true; else return false; }*/
	/*public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); boolean t=triangle(a,b,c);
	 if(t)System.out.println("不可以成為三角形"); else System.out.println("可以成為三角形");
	 }
	 public static boolean triangle(int a,int b,int c) { if(a>b+c || b>a+c || c>a+b)return true; else return false; }*/
	
	 

	// 2
	
	 public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt(); boolean t=year(a); if(t)System.out.println("是閏年"); else
	 System.out.println("不是閏年"); }
	 
	 public static boolean year(int a) { 
		 if(a%4==0) {
			 if(a%100==0) {
				 if(a%400==0) {
					 return true;
				 }
				 else return false;
			 }
			 else return true;
		 }
		 else return false;
	 }
	 

	// 3
	/*public static void main(String[] args) {
		int a[]={8,6,9,12,47,55,10};
		int max = max(a);
		int min = min(a);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		}

	public static int max(int a[]) {
		int max=0;
		for(int i:a)if(max<i)max=i;
		return max;
	}
	public static int min(int a[]) {
		int min=10000;
		for(int i:a)if(min>i)min=i;
		return min;
	
	}*/

}
