import java.util.*;
public class HW1_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//1
	int sum=0;
	int a=sc.nextInt();
	while(a>=3) {
		a=a/2;
		sum++;}
	System.out.println("對折"+sum+"次");
	
	//2
	int hp=100;
	while(hp>=0) {
		int atack=(int)(Math.random()*30)+1;
		System.out.println("怪獸受到"+atack+"傷害!");
		hp-=atack;
	}
		System.out.println("打倒怪獸了");
	}
}
