import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="the good people is the ones that act honestly.";
		System.out.print(getCount(str,"the"));
	}
	public static int getCount(String str, String ch){
        //1.定義一個變量，用來記錄查找到ch的次數
        int count = 0;
        //2.查找str字符串中出現ch字符的次數
        int index = 0;
        while ((index = str.indexOf(ch)) != -1) {//說明查找到了字符ch出現的位置
        	count++; //出現的次數累加1
            str = str.substring(index + 4);//更新str字符串中的內容
        }
        return count;
    }

}
