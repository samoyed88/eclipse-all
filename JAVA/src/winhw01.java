import java.util.*;
import java.lang.Math;
public class winhw01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2;
		//[組別-1][第幾位-1][組別學號姓名]
		String [][][] A= {
					{{"一","1213xxxx","xxx"},{"一","1213yyyy","yyy"}},
					{{"二","1213zzzz","zzz"},{"二","1213xyxy","xy"},{"二","1213yxyx","yx"}},
					{{"三","1213qqqq","qqq"},{"三","1213qaqa","qaq"}}
				};
		show(A);
		System.out.println("請輸入請假或缺席者學號，如果輸入完成請輸入N或n");
		String str=sc.next();
		char ch=str.charAt(0);
		while(ch!='N' && ch!='n') {
			A=search(str,A);
			str=sc.next();
			ch=str.charAt(0);
		}
		show(A);
		System.out.println("第一次抽籤名單");
		random(A);
		System.out.println("請輸入Y重抽，N退出");
		ch=sc.next().charAt(0);
		while(ch!='N' && ch!='n') {
			System.out.println("第"+i+"次抽籤名單");
			random(A);
			System.out.println("請輸入Y重抽，N退出");
			ch=sc.next().charAt(0);
			i++;
		}
		sc.close();
	}
	
	//隨機抽一組名單
	public static void random(String a[][][]) {
		int num=(int)(Math.random()*10); //隨機一個1~10的數字
		for(int i=0;i<a.length;i++) {
			num%=a[i].length;  //隨機數除小組人數的餘數
				for(int k=0;k<a[i][num].length;k++) {
					System.out.print(a[i][num][k]+" ");  
				}
				System.out.println();
			}
		
	}
	//顯示所有名單
	public static void show(String a[][][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}System.out.println();
			}
			System.out.println();
		}
	}
	
	//透過學號或姓名尋找陣列位置
	public static String[][][] search(String str,String a[][][]){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					//使用equals找到相同字串
					if(a[i][j][k].equals(str)) {
							a[i][j][0]="0";a[i][j][1]="0";a[i][j][2]="0";
						}
				}
			}
		}
		return a;
	}
}