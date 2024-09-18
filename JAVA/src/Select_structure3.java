import java.util.*;
public class Select_structure3 {
	public static void main (String[] argv)
	{
		Scanner sc = new Scanner(System.in);
		double dollar = sc.nextInt();
		if (dollar < 0)
		{
			System.out.println("輸入錯誤");
		}
		else if (dollar <= 500)
		{
			dollar = dollar*(0.9);
			System.out.println("打九折，共"+dollar+"元");
		}
		else if (dollar < 1000)
		{
			dollar = dollar*(0.85);
			System.out.println("打八五折，共"+dollar+"元");
		}
		else if (dollar < 2000)
		{
			dollar = dollar*(0.8);
			System.out.println("打八折，共"+dollar+"元");
		}
		else if (dollar < 4000)
		{
			dollar = dollar * (0.7);
			System.out.println("打七折，共"+dollar+"元");
		}
		else 
		{
			dollar = dollar * (0.6);
			System.out.println("打六折，共"+dollar+"元");
		}
	}
}
