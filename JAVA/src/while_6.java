import java.util.*;
public class while_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int range=a/2;
		int i;
		boolean c=true;
		for(i=2;i<range+1;i++) {
			if(c=((a%i)== 0)) {
				if(c==true) {c=false;System.out.print(a+"不是質數，可以被"+i+"整除 ");}
			}
		}
		if(c==true) {System.out.print(a+"是質數");}
	}

}
