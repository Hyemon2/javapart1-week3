package Tutorial_week9;

public class EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =10; //sum ������ �����ϰ� ó�� ���� 10���� �����Ѵ�.
		for (int i =0; i<args.length; i++) { //0���� args�迭�� ���̱��� �ݺ��ϴ� for�� �ݺ����� �����.
			sum = sum +Integer.parseInt(args[i]); //sum ������ args�迭�� i��° ���� ���������� ��ȣ�� �� ���� ���� ����
		}
		System.out.println(sum); //sum���� ���� ����Ѵ�.
	}

}
