import java.util.Scanner;
import java.util.*;
public class cace01_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//建立四個ArrayList 其中兩個為姓名 兩個為學號
		ArrayList<String>[] name =new ArrayList[3];
		ArrayList<String>[] number = new ArrayList[3];
		ArrayList<String>[] name2 = new ArrayList[3];
		ArrayList<String>[] number2 = new ArrayList[3];
		int count=1;
		name=creation1();name2=creation1();
		number=creation2();number2=creation2();
		
		show(name2,number2);
		//請假者刪除(不會抽到)
		System.out.println("請輸入請假或缺席者學號，如果輸入完成請輸入N或n");
		String str=sc.next();
		char ch=str.charAt(0);
		while(ch!='N' && ch!='n') {
			search(number2,Integer.parseInt(str),name2);
			str=sc.next();
			ch=str.charAt(0);
		}
		show(name2,number2);
		
		//隨機抽取
		int num=(int)(Math.random()*10);//隨機一個1~10的數字
		random(name2,number2,num);
		System.out.println("輸入任意字可重抽，N退出");
		ch=sc.next().charAt(0);
		while(ch!='N' && ch!='n') {
			System.out.println("第"+count+"次抽籤名單");
			random(name2,number2,++num);
			System.out.println("輸入任意字可重抽，N退出");
			ch=sc.next().charAt(0);
			count++;
		}
		//最原始的名單
		show(name,number);
		
	}
		//將姓名建立成ArrayList
		public static ArrayList<String>[]  creation1() {
			ArrayList<String>[] name=new ArrayList[3];
			
			name[0]=new ArrayList<String>();
			name[0].add("aaa");
			name[0].add("bbb");
			name[0].add("ccc");
			
			name[1]=new ArrayList<String>();
			name[1].add("xxx");
			name[1].add("yyy");
			
			name[2]=new ArrayList<String>();
			name[2].add("abc");
			name[2].add("bcd");
			name[2].add("cde");
			name[2].add("def");
			return name;
		}
		//將學號建立成ArrayList
		public static ArrayList<String>[]  creation2(){
			ArrayList<String>[] number = new ArrayList[3];
			number[0]=new ArrayList<String>();
			number[0].add("12131111");
			number[0].add("12131112");
			number[0].add("12131113");
			
			number[1]=new ArrayList<String>();
			number[1].add("12132222");
			number[1].add("12132223");
			
			number[2]=new ArrayList<String>();
			number[2].add("12133333");
			number[2].add("12133334");
			number[2].add("12133335");
			number[2].add("12133336");
			return number;
		}
		//顯示所有名單
		public static void show(ArrayList<String>[] a,ArrayList<String>[] b) {
			System.out.println("顯示所有人");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].size();j++) {
					System.out.print(a[i].get(j)+" "+b[i].get(j));
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//隨機抽一組名單
		public static void random(ArrayList<String>[] a,ArrayList<String>[] b,int num) {
			 
			for(int i=0;i<a.length;i++) {
				num%=a[i].size();  //隨機數除小組人數的餘數
				System.out.println("本次抽到的為：");
				System.out.println("第"+(i+1)+"組"+a[i].get(num));
				}
			
		}
		//搜尋某學號並且刪除
		public static void search(ArrayList<String>[] b,int c,ArrayList<String>[] a){
			int num=-1;
			
			//outer為標籤
			outer:for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].size();j++){
						num=b[i].indexOf(c);
						if(num!=-1) {
							a[i].remove(num);
							b[i].remove(num);
							break outer; //跳出外層迴圈(標籤為outer的迴圈)
						}
					}
				}
		}

}
