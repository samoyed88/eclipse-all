import java.util.Scanner;
public class HW4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//9
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}

	}

}
