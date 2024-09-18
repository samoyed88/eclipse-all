import java.util.*;
public class Sekect_structure3_2 {
	public static void main (String[] argv)
	{
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextInt();
		if (salary < 0)
		{
			System.out.println("輸入錯誤");
		}
		else if (salary <= 40)
		{
			salary = salary*176;
			System.out.println("薪水"+salary+"元");
		}
		else if (salary <= 60)
		{
			salary = salary*176*1.33;
			System.out.println("薪水"+salary+"元");
		}
		else if (salary <= 80)
		{
			salary = salary*176*1.66;
			System.out.println("薪水"+salary+"元");
		}
		else if (salary <= 120 )
		{
			salary = salary*176*2;
			System.out.println("薪水"+salary+"元");
		}
	}
}
