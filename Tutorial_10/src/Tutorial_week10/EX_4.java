package Tutorial_week10;

public class EX_4 {
public static class Television {
	int channel;
	int volume;
	boolean onOff;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television Mytv = new Television();
		Mytv.channel=7;
		Mytv.volume = 9;
		Mytv.onOff = true;
		
		Television yourtv = new Television();
		yourtv.channel =9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		System.out.println("���� tv ä���� "+Mytv.channel+"�̰� ������ "+Mytv.volume+"�Դϴ�.");
		System.out.println("����� tv ä���� "+yourtv.channel+"�̰� ������ "+yourtv.volume+"�Դϴ�.");
	}

}
