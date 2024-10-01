package Tutorial_week11;
import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의 개수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
