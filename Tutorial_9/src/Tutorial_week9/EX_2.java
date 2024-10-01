package Tutorial_week9;

public class EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =10; //sum 변수를 선언하고 처음 값을 10으로 설정한다.
		for (int i =0; i<args.length; i++) { //0부터 args배열의 길이까지 반복하는 for문 반복문을 만든다.
			sum = sum +Integer.parseInt(args[i]); //sum 변수에 args배열의 i번째 값을 정수형으로 변호나 후 더한 값을 대입
		}
		System.out.println(sum); //sum변수 값을 출력한다.
	}

}
