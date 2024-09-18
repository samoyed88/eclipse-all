import java.util.*;
public class hw12121 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,z=1;
		
		for(i=1;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print(z);
			}
			System.out.println();
			z++;
		}
		System.out.println();
		
		z=1;
		for(i=1;i<5;i++) {
			for(j=5;j>i;j--) {
				System.out.print(z);
			}
			System.out.println();z++;
		}
		System.out.println();
		int a=0;
		for(i=1;i<5;i++) {
			for(a=4;a>i;a--) {
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print(z);
				z++;
			}
			System.out.println();z=1;
		}
		System.out.println();
		
		z=4;int b=0;
		for(i=1;i<5;i++) {
			z=4;z-=b;b++;
			for(a=1;a<i;a++) {
				System.out.print(" ");
			}
			for(j=5;j>i;j--) {
				System.out.print(z);
				z--;
			}
			
			System.out.println();
		}
		
	}

}
