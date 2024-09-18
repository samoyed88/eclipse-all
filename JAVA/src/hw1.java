import java.util.*;
public class hw1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i*i+" ");
		}
		System.out.println();
		
		//2
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		for(num1=num1;num1<=num2;num1++) {
			sum+=num1;
		}
		System.out.println(sum);
		
		
		//3
		System.out.println("1到100可以被16整除的數");
		for(int i=1;i<=100;i++) {
			if(i%16==0)System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("1到100可以被2和5整除的數");
		for(int i=1;i<=100;i++) {
			if(i%2==0 && i%5==0)System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("1到100可以被3或7整除的數");
		for(int i=1;i<=100;i++) {
			if(i%3==0 || i%7==0)System.out.print(i+" ");
		}
		System.out.println();	
	}
}
