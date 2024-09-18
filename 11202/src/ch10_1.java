import java.util.*;
public class ch10_1 {
	
	
	public static void main(String[] args) {
		String str="snejnfknWevis2jkdjviIsenfis",strrrr="asves";
		StringBuffer strb = new StringBuffer(str);
		//全部轉成大寫或小寫
		str=str.toUpperCase();
		str=str.toLowerCase();
		System.out.println(
			//字串當中有沒有包含"is"字串
			str.contains("is")+" "
			//字串當中是否以"is"字串結尾或開始
			+str.endsWith("is")+" "
			+str.startsWith("is")+" "
			//索引值5的字元
			+str.charAt(5)
			);
			//有幾個"is"在字串當中
			int index=0,count=0;
			while((index=str.indexOf("is",index)) != -1){
				index+="is".length();
				count++;
			}
		System.out.println(count+" "
			//字串"is"替換成"was"
			+str.replace("is","was")+"\r\n"
			//是否為空字串
			+str.isBlank()+"\r\n"
			//字尾加入內容
			+strb.append("fdjifn3")+"\r\n"
			//字串中插入內容
			+strb.insert(5,"dsnfue")+"\r\n"
			//字串中刪除部分內容
			+strb.delete(5,11)+"\r\n"
			//去除空白符號
			+str.trim()+"\r\n"
			//字串反轉
			+strb.reverse()+"\r\n");
			//更改某索引值之字串(會更改原字串)
			strb.setCharAt(2,'F');
			System.out.println(strb);
			//印出字串當中第2位到第4位
			System.out.println(str.substring(2,10));
			//依照ASCII排列
			System.out.println(str.compareTo(strrrr));
	}

}
