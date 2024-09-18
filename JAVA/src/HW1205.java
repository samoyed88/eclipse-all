import java.util.*;
public class HW1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		System.out.println("輸入考生人數");
		a=sc.nextInt();
		int str[][]=new int[a][];
		for(int j=0;j<str.length;j++) {
			System.out.print("請輸入考科數");
			b=sc.nextInt();
			str[j]=new int[b];
			for(int i=0;i<b;i++) {
				System.out.print("請輸入成績");
				str[j][i]=sc.nextInt();
			}
		}
		
		for(int j=0;j<str.length;j++) {
			for(int i=0;i<str[j].length;i++) {
				System.out.print("第"+(j+1)+"位學生"+str[j][i]+" ");
			}System.out.println();
		}
	}

}
