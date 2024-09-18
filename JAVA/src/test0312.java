import java.util.*;
class IC_Card{
	long number;
	int money;
	IC_Card(long a,int b){
		this.number=a;
		this.money=b;
	}
	void Chargeback(int a){
		if(Checking(a))money-=a;
		else {Bonus();money-=a;};
		
	}
	void Bonus(){
		money+=500;
	}
	boolean Checking(int a){
		if(money<a)return false;
		else return true;
	}
	void showInfo(){
		System.out.println("account number:"+number);
		System.out.println("account balance"+money);
	}
}
public class test0312 {
	public static void main(String[] args) {
		IC_Card c1=new IC_Card(9876543210l,300);
		IC_Card c2=new IC_Card(154,42);
		c1.showInfo();
		c2.showInfo();
		c1.Chargeback(180);
		c2.Chargeback(180);
		c1.showInfo();
		c2.showInfo();
	}
}
