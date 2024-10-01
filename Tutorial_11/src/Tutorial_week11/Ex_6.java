package Tutorial_week11;
import java.util.Scanner;
public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대공약수를 구할 두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(num1!=num2) {
			if (num1>num2) {
				num1 =num1-num2;
			} else {
				num2 = num2-num1;
			}
		}
		System.out.println("최대 공약수 : "+num1);
	}

}
