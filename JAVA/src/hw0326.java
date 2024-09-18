import java.util.*;
public class hw0326 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		boolean isID;
		do {
		isID=true;
		str=sc.next();
		if(!str.matches("[a-zA-Z]\\d{9}")){
			isID=false;
		}
		}while(isID);
    }
}

