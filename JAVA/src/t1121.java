import java.util.*;
public class t1121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一數字作為答案");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		while(b!=a) {
			System.out.println("猜錯了");
			b=sc.nextInt();
			c++;
			if (c==10) {System.out.println("遊戲結束!"+a);break;}
		}
		if(b==a)
		System.out.println("猜對啦");
	}
}
