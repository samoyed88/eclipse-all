import java.util.Calendar;

public class TimeCheck {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        Calendar startTime1 = Calendar.getInstance();
        startTime1.set(19, 0, 0);
        Calendar endTime1 = Calendar.getInstance();
        endTime1.set( 21, 0, 0);
        
        Calendar startTime2 = Calendar.getInstance();
        startTime2.set(9, 0, 0);
        Calendar endTime2 = Calendar.getInstance();
        endTime2.set(15, 0, 0); 

        if (now.after(startTime1) && now.before(endTime1)) 
        {
            System.out.println("現在便當打七折");
        }
        else if (now.after(startTime2) && now.before(endTime2))
        {
        	System.out.println("現在便當買一送一唷");
        }
        else 
        {
            System.out.println("客人要不要買個便當!");
        }
    }
}