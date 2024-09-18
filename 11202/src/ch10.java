import java.util.*;
public class ch10 {
	public static void main(String[] args) {
		String str="測試字串";
		String abc="Aabc";
		System.out.println("字串顯示");
		System.out.println("1. "+str+"\r\n2. "+abc);
		System.out.println();
		
		//字串長度 length()
		System.out.println("字串長度");
		System.out.println(str.length());
		System.out.println(abc.length());
		System.out.println();
		
		//字串內有無某字元(串) contains()
		System.out.println("字串內有沒有包含a\r\n  "+str.contains("a"));
		System.out.println();
		//字串"a"的位置 indexOf()
		System.out.println("字串a第一個出現的位置\r\n  "+str.indexOf("a"));
		System.out.println();
		//字串中有幾個a
		int index=str.indexOf("a"),count=0;
			do {
				index += "is".length();
				count++;
			}while((index=str.indexOf("a",index)) != -1);
			
			
		System.out.println("字串中有幾個a\r\n  "+count+"個");
		System.out.println();
		//字串"測試"是否為開頭&結尾 startsWith endWith
		System.out.println("字串a是否為開頭\r\n  "+str.startsWith("測試"));
		System.out.println("字串a是否為結尾\r\n  "+str.endsWith("測試"));
		System.out.println();
		//從字串中某位置到某位置 
		System.out.println("字串第2位到第7位\r\n  "+str.substring(2,8));
		System.out.println();
		//字串"a"最後的出現位置
		System.out.println("字串a最後的出現位置\r\n  "+str.lastIndexOf("a"));
		System.out.println();
		//字串"123"替換為"456"
		System.out.println("字串123替換為456\r\n  "+str.replace("123","456"));
		System.out.println("ps:原字串不會變更："+str);
		System.out.println();
		//全部大寫&全部小寫
		System.out.println("全部大寫\r\n  "+str.toUpperCase());
		System.out.println("全部小寫\r\n  "+str.toLowerCase());
		System.out.println();
		//按照ASCII排列
		String[] strArray = new String[5]; 
		strArray[0]="cde";
		strArray[1]="abc";
		strArray[2]="bcd";
		strArray[3]="def";
		strArray[4]="fgh";
		String s="";
		for(int i=0;i<strArray.length-1;i++){
			for(int j=0;j<strArray.length-1;j++){
				if(strArray[j].compareTo(strArray[j+1])>0){s=strArray[j];strArray[j]=strArray[j+1];strArray[j+1]=s;}
			}
		}
		System.out.print("按照ASCII排序結果：\r\n");
		for(String a:strArray) {
			System.out.println("  "+a);
		}
		System.out.println();
		//是否為空字串
		System.out.println("是否為空字串\r\n  "+str.isBlank());
		System.out.println();
		//字尾加內容
		StringBuffer strb=new StringBuffer(str);
		System.out.println("字尾加字\r\n"+strb.append("TEST"));
		System.out.println();
		//字串中插入內容
		StringBuffer strc=new StringBuffer(str);
		System.out.println("字串中加內容\r\n"+strc.insert(1, "TEST"));
		System.out.println();
	}

}
