import java.util.*;
public class test1212 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] A = new int[5];
		int i;
		
		for(i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
			System.out.print(A[i]+" ");
		}
		System.out.println();
		for(i=A.length-1;i>=0;i--) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		for(i=0;i<A.length;i++) {
			System.out.print(A[i]*A[i]*A[i]+" ");
		}
		System.out.println();

	}

}
