package Tutorial_week10;

public class EX_5 {
public static class Box {
	int width;
	int length;
	int height;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box Firstbox = new Box();
		Firstbox.width=20;
		Firstbox.length=20;
		Firstbox.height=30;
		System.out.println("ù ��° ������ ����, ����, ���̴� ���� "
							+Firstbox.width+", "+Firstbox.length+", "+Firstbox.height+" �Դϴ�.");
		Box Secondbox = new Box();
		Secondbox.width=40;
		Secondbox.length=50;
		Secondbox.height=100;
		System.out.println("�� ��° ������ ����, ����, ���̴� ���� "
							+Secondbox.width+", "+Secondbox.length+", "+Secondbox.height+" �Դϴ�.");
	
	}

}
