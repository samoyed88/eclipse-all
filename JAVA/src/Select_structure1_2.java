// 引入java.util套件，用於取得目前的時間
import java.util.*;

public class Select_structure1_2 {

    public static void main(String[] args) {
        // 建立一個Calendar物件，用於存放目前的日期和時間
        Calendar calendar = Calendar.getInstance();
        // 取得目前的小時數，範圍是0到23
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // 宣告一個字串變數，用於存放優惠訊息
        String message = "";
        // 判斷目前的小時數，根據不同的時間區間，設定不同的優惠訊息
        if (hour >= 21 && hour <= 23) {
            // 如果是21到24點，則設定優惠訊息為九折
            message = "九折";
        } else if (hour == 9 || hour == 10) {
            // 如果是9到10點，則設定優惠訊息為買一送一
            message = "買一送一";
        } else {
            // 其他時間，則設定優惠訊息為歡迎購買
            message = "歡迎購買";
        }
        // 輸出優惠訊息
        System.out.println(message);
    }	
}

