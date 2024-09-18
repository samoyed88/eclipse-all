import java.util.*;
public class hw1205_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%5==0 && a%3==0) {System.out.print("可被5與7同時整除");
			if(a%5==0)System.out.print("可被5整除");
			if(a%3==0)System.out.print("可被3整除");}
		else System.out.print("不可被3及5整除");
	}
}
