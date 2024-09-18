import java.util.*;
public class Select_structure2 {
	public static void main (String[] argv) {
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		if (score > 100 ||  score < 0 )
		{
			System.out.println("輸入錯誤");
		}
		else if (score >= 90)
		{
			System.out.println("等級A");
		}
		else if (score >= 80)
		{
			System.out.println("等級B");
		}
		else if (score >= 70)
		{
			System.out.println("等級C");
		}
		else if (score >= 60)
		{
			System.out.println("等級D");
		}
		else 
		{
			System.out.println("等級F");
		}
	}
}
