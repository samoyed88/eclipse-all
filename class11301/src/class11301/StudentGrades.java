package class11301;
import java.util.ArrayList;
import java.util.Scanner;

// 定義學生類
class Student {
    String name;               // 學生姓名
    int calculusScore;         // 微積分成績
    int programmingScore;      // 程式設計成績
    int managementScore;       // 管理學成績
    double averageScore;       // 三科的平均成績

    // Constructor
    public Student(String name, int calculusScore, int programmingScore, int managementScore) {
        this.name = name;
        this.calculusScore = calculusScore;
        this.programmingScore = programmingScore;
        this.managementScore = managementScore;
        this.averageScore = (calculusScore + programmingScore + managementScore) / 3.0;  // 計算平均成績
    }

    @Override
    public String toString() {
        return String.format("%s\t%d\t\t%d\t\t%d\t\t%.2f", name, calculusScore, programmingScore, managementScore, averageScore);
    }
}

public class StudentGrades {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); // 儲存學生資料的動態陣列
        Scanner sc = new Scanner(System.in);

        // 輸入 5 位學生的資料
        for (int i = 0; i < 5; i++) {
            System.out.println("請輸入第 " + (i + 1) + " 位學生的姓名：");
            String name = sc.next();

            System.out.println("請輸入 " + name + " 的微積分成績：");
            int calculusScore = sc.nextInt();

            System.out.println("請輸入 " + name + " 的程式設計成績：");
            int programmingScore = sc.nextInt();

            System.out.println("請輸入 " + name + " 的管理學成績：");
            int managementScore = sc.nextInt();

            // 將學生資料加入到學生清單
            students.add(new Student(name, calculusScore, programmingScore, managementScore));
        }

        // 使用冒泡排序依照平均成績從高到低排序
        bubbleSort(students);

        // 輸出成績一覽表
        System.out.println("成績一覽表 (依總平均由高至低排序)：");
        System.out.println("姓名\t微積分\t程式設計\t管理學\t總平均");

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }

    // 冒泡排序實作，根據平均成績進行降序排序
    public static void bubbleSort(ArrayList<Student> students) {
        int n = students.size();  // 取得學生數量
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // 如果前一位學生的平均成績小於後一位學生的平均成績，則交換
                if (students.get(j).averageScore < students.get(j + 1).averageScore) {
                    // 交換兩個學生的位置
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}
