import java.util.*;
public class ch7_12130383 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("請輸入陣列數量");
		int a=sc.nextInt();
		int A[]=new int[a];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		printary(A);
		int max=max(A);
		int min=min(A);
		System.out.print("\nmax:"+max+"\nmin:"+min+"\n");
		avg(A);
		A=sort(A);
		printary(A);
	}
	public static void printary(int A[]) {
		for(int i:A) {
			System.out.print(i+" ");
		}
		
	}
	public static int max(int A[]) {
		int max=0;
		for(int i:A)if(i>max)max=i;
		return max;
	}
	public static int min(int A[]) {
		int min=100000;
		for(int i:A)if(min>i)min=i;
		return min;
	}
	public static int[] sort(int a[]) {
		int num=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {num=a[j];a[j]=a[j+1];a[j+1]=num;}
			}
		}
		return a;
	}
	public static void avg(int a[]) {
		double sum=0;
		for(int i:a)sum+=i;
		System.out.println("sum:"+(int)sum);
		System.out.println("avg:"+sum/(a.length));
	}
	

}
