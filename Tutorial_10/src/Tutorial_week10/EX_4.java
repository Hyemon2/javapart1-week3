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
		System.out.println("나의 tv 채널은 "+Mytv.channel+"이고 볼륨은 "+Mytv.volume+"입니다.");
		System.out.println("당신의 tv 채널은 "+yourtv.channel+"이고 볼륨은 "+yourtv.volume+"입니다.");
	}

}
