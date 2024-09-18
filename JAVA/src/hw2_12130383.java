import java.util.*;
public class hw2_12130383 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] A = new int[3][4];
		int i,j,num=0;
		for(i=0;i<A.length;i++) {
			for(j=0;j<A[i].length;j++) {
				A[i][j]=sc.nextInt();
				System.out.print(A[i][j]+" ");
				num=A[i][j]*A[i][j]+num;
			}
			System.out.println();
		}
		System.out.println();
		System.out.print(num);
		
	}
	

}
