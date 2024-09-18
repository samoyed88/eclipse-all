import java.util.*;

public class t1121_3 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++)

			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
