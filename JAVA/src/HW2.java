import java.util.Scanner;
public class HW2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//4
			int N=sc.nextInt();
			int num3=0,num5=0,num15=0;
			for(int i=1;i<N;i++) {
				if(i%3==0)num3++;
				if(i%5==0)num5++;
				if(i%15==0)num15++;
				}
			System.out.println("3的倍數"+num3+"個");
			System.out.println("5的倍數"+num5+"個");
			System.out.println("15的倍數"+num15+"個");
				
		//5
			String str=sc.next();
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		//6
			System.out.println("請輸入寬及高");
			int width=sc.nextInt(),hight=sc.nextInt();
			for(int i=0;i<hight;i++) {
				for(int j=0;j<width;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//7
			for(int i=1;i<6;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
	
}
	}
