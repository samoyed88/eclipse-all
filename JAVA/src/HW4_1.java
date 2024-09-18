import java.util.*;
public class HW4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//5
		int num1=sc.nextInt(),num2=0+sc.nextInt(),i=1;
		while(num1!=num2) {
			System.out.println("第"+i+"次輸入不符合，請再輸入，注意只有3次");
			if(i==3) {System.out.print("錯誤");System.exit(0);}
			i++;
			num2=sc.nextInt();
		}
		
		

	}

}
