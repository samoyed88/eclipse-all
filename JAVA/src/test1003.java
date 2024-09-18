import java.util.*;
public class test1003 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b="";
		int c=a/10;
		if(a==11 ||a==12)c--;
		if(a==20 ||a==21 || a==22 || a==23 || a==24 || a==25)c--;
		if(a==39 || a==40)c++;
		switch(c) {
		case 0:b="黑桃";break;
		case 1:b="梅花";break;
		case 2,3:b="紅心";break;
		case 4,5:b="方塊";break;
		}
		System.out.print(b);
}
}
