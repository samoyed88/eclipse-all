import java.util.*;
public class t0409 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		/*boolean isID;
		do {
			isID=true;
			str=sc.next();
			if(!str.matches("[a-zA-Z]\\d{9}")) {
				isID=false;
				System.out.println("輸入錯誤");
			}
		}while(isID);
		*/
		//電話
		/*
		boolean isnum;
		do {
			isnum=true;
			str=sc.next();
			if(!str.matches("0[0-9]\\d{6}")) {
				if(!str.matches("0[0-9]\\d{7}")) {
					if(!str.matches("0[0-9]\\d{8}")) {
						isnum=false;
						System.out.println("錯誤");
					}
				}
			}
		}while(isnum);
		*/
		
		/*boolean isemail;
		do {
			isemail=true;
			str=sc.next();
			if(!str.matches("[A-Za-z0-9]+@[A-Za-z0-9.]+")) {
				isemail=false;
				System.out.println("錯誤");
			}
		}while(isemail);
	*/
		str="這是一個測試A字串";
		System.out.println(str.indexOf(65));
		}

}
