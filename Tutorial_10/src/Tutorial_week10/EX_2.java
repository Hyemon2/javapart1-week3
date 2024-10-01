package Tutorial_week10;
import java.util.Scanner;
public class EX_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int koreascore = sc.nextInt();
		int engscore = sc.nextInt();
		int mathscore = sc.nextInt();
		
		double avg = (koreascore+engscore+mathscore)/3;
		
		if (avg>=60) {
			System.out.println("Average : "+avg);
			System.out.println("PASS");
		} else {
			System.out.println("Average"+avg);
			System.out.println("FAIL");
		}

		
				
	}
}
