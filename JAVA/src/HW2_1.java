import java.util.*;
public class HW2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//3
		int sum=0,score=0,i=0;
		do {
			score=sc.nextInt();
			sum=sum+score;
			i++;
		}while(score!=-1);
		System.out.print((i-1)+"人，總平均"+(sum+1)/(i-1));
	}

}
