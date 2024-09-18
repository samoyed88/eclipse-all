import java.util.Scanner;
public class HW3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//8
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>0;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=(i*2-1);k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}