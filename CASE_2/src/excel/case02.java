package excel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.*;

class addlist{
	private int Max = 0;// 組別數
	ArrayList<String>[] list;
	addlist() {
	}

	addlist(int a) {
		this.Max = a;
		list = new ArrayList[Max];
		for (int i = 0; i < Max; i++) {
			list[i] = new ArrayList<String>();
		}
	}
}

public class case02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 建立Scanner物件
		addlist list = read();// 原始資料(不修改)
		ScoreRead(list);
		show(list);
		
	}

	public static addlist read() {
		int group = 0;
		try {
			// 使用Apache POI庫中的XSSFWorkbook類別來建立一個Excel工作簿的物件，並從指定的檔案路徑中讀取檔案內容
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(
					new FileInputStream("C:\\Users\\befor\\eclipse-workspace\\excel\\src\\excel\\分組名單.xlsx"));
			// 使用xssfWorkbook物件的getSheetAt方法來取得第一個工作表(sheet)的物件，並存入sheet變數中
			// XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
			XSSFSheet sheet = xssfWorkbook.getSheet("工作表2");
			// 使用sheet物件的getLastRowNum方法來取得工作表中的最大行數，並存入maxRow變數中
			int maxRow = sheet.getLastRowNum();
			addlist list = new addlist(maxRow);
			// 使用for迴圈來遍歷工作表中的每一行(row)，從第1行開始，到最大行數結束，每次遞增1
			for (int row = 1; row <= maxRow; row++) {
				// 讀取組別
				XSSFCell groupcell = sheet.getRow(row).getCell(2);
				group = (int) groupcell.getNumericCellValue();
				//group = Integer.parseInt(groupcell.toString());
				// 讀取學號
				XSSFCell numcell = sheet.getRow(row).getCell(0);
				// 讀取姓名
				XSSFCell namecell = sheet.getRow(row).getCell(1);
				list.list[row-1].add(numcell.toString());
				list.list[row-1].add(namecell.toString());
				list.list[row-1].add(groupcell.toString());
			}
			return list;
			// 如果發生IOException異常，則捕捉並印出異常的堆疊追蹤
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// 建構original物件
		addlist list = new addlist(group);
		return list;
	}
	
	//顯示陣列內容
	public static void show(addlist list) {
		for (int i = 0; i < list.list.length; i++) {
			for (int j = 0; j < list.list[i].size(); j++) {
				System.out.print(list.list[i].get(j)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//讀取分數excel
	public static void ScoreRead(addlist list) {
		int group = 0;
		int score=0;
		try {
			// 使用Apache POI庫中的XSSFWorkbook類別來建立一個Excel工作簿的物件，並從指定的檔案路徑中讀取檔案內容
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(
					new FileInputStream("C:\\Users\\befor\\eclipse-workspace\\CASE_2\\src\\excel\\輸入格式.xlsx"));
			// 使用xssfWorkbook物件的getSheetAt方法來取得第一個工作表(sheet)的物件，並存入sheet變數中
			// XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
			XSSFSheet sheet = xssfWorkbook.getSheet("工作表2");
			// 使用sheet物件的getLastRowNum方法來取得工作表中的最大行數，並存入maxRow變數中
			int maxRow = sheet.getLastRowNum();
			// 使用for迴圈來遍歷工作表中的每一行(row)，從第1行開始，到最大行數結束，每次遞增1
			for (int row = 1; row <= maxRow; row++) {
				// 讀取評分人學號
				XSSFCell num0cell = sheet.getRow(row).getCell(1);
				// 讀取被評分人學號
				XSSFCell num1cell = sheet.getRow(row).getCell(2);
				// 讀取評分
				XSSFCell scorecell = sheet.getRow(row).getCell(3);
				score = (int) scorecell.getNumericCellValue();
				//查詢被評分人學號
				search(list,num1cell.toString(),score);
			}
			// 如果發生IOException異常，則捕捉並印出異常的堆疊追蹤
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void search(addlist list, String str, int num) {
	    // 遍歷每個小組
	    for (int i = 0; i < list.list.length; i++) {
	        // 遍歷小組內的每一個成員
	        for (int j = 0; j < list.list[i].size(); j++) {
	            // 如果找到了str
	            if (list.list[i].get(j).equals(str)) {
	                // 檢查是否已經有分數（評分通常在學號之後存儲）
	                if (j + 1 < list.list[i].size()) {
	                    try {
	                        // 嘗試將該位置的值解析為整數
	                        int existingScore = Integer.parseInt(list.list[i].get(j + 1));
	                        // 如果成功解析，則將新分數與舊分數相加
	                        int newScore = existingScore + num;
	                        // 更新分數
	                        list.list[i].set(j + 1, Integer.toString(newScore));
	                        System.out.println("找到 '" + str + "' 並更新評分為: " + newScore);
	                    } catch (NumberFormatException e) {
	                        // 如果無法解析為整數，說明該位置可能不是評分，直接添加新分數
	                        list.list[i].add(j + 1, Integer.toString(num));
	                        System.out.println("找到 '" + str + "' 並添加新評分: " + num);
	                    }
	                } else {
	                    // 如果學號後面還沒有評分，則添加新分數
	                    list.list[i].add(Integer.toString(num));
	                    System.out.println("找到 '" + str + "' 並添加新評分: " + num);
	                }
	                return;  // 找到並處理後返回
	            }
	        }
	    }
	    // 如果沒有找到，打印提示
	    System.out.println("未找到 '" + str + "' 在名單中。");
	}
	
	
}

