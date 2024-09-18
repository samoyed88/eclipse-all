import java.util.*;
public class hw2_2_12130383 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double [][] A = {{18.2,17.3,15.0,13.4},{23.8,25.1,20.6,17.8},{20.6,21.5,18.4,15.7}};
		int i,j,d=1;
		float avg=0;
		for(i=0;i<A.length;i++) {
			for(j=0;j<A[i].length;j++) {
				System.out.printf(A[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<A[0].length;i++) {
			for(j=0;j<A.length;j++) {
				avg+=A[j][i];
			}
			System.out.print("星期"+d+"平均"+avg/3);
			d++;
			avg=0;
		}
		d=1;
		System.out.println();
		for(i=0;i<A.length;i++) {
			for(j=0;j<A[i].length;j++) {
				avg+=A[i][j];
			}
			System.out.print("時段"+d+"平均"+avg/4);
			d++;
			avg=0;
		}

	}

}
