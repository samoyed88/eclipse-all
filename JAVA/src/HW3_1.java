import java.util.*;
public class HW3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//4
				int sum=0,score=0,i=0,o=3;
				do {
					score=sc.nextInt();
					if(score<=100 && score>=0) {
					sum=sum+score;
					i++;}
					else {System.out.print("資料錯誤，必須是 0 與 100 之間的正整數，請重新輸入，有"+o+"次機會");o--;}
					if(o==-1) System.exit(0);
				}while(score!=-1);
				System.out.print((i-1)+"人，總平均"+(sum+1)/(i-1));
	}

}
