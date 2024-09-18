import java.util.*;
public class Select_structure1 {
	public static void main (String[] argv) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0)
		{
			System.out.println("偶數");
		}
		else if (num%2 == 1)
		{
			System.out.println("奇數");
		}
		else {
			System.out.println("輸入錯誤");
		}
		
		
		int score = sc.nextInt();
		if (score >79 && score <90)
		{
			System.out.println("等級B");
		}
		else if (score > 100 || score < 0)
		{
			System.out.println("資料輸入錯誤");
		}
		else
		{
			System.out.println("其他等級");
		}
		
		
		
		int gas = sc.nextInt();
		if (gas <= 20)
		{
			System.out.println("瓦斯費為150元");
		}
		else if (gas <= 0)
		{
			System.out.println("資料輸入錯誤");
		}
		else
		{
			int a = (gas-20)*4+150;
			System.out.println("瓦斯費為:"+a+"元");
		}
		
		
		int num2 = sc.nextInt();
		if (num2%5==0 && num2%5==0)
		{
			System.out.println("可以被5及7同時整除");
		}
		else if (num2%5==0)
			{
				System.out.println("可以被5整除");
			}
		else if (num2%7==0)
		{
			System.out.println("可以被7整除");
		}
		else System.out.println("不能被5及7整除");
		
	}
}
