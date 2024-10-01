package Tutorial_week11;

public class Ex_1 {
	public static class Television {
		int channel;
		int volume;
		boolean onOff;
		
		public int getChannel() {
			return channel;
		}
	}

	public static void main(String[] args) {
		Television Mytv = new Television();
		Mytv.channel=7;
		Mytv.volume = 9;
		Mytv.onOff = true;
		
		int ch = Mytv.getChannel();
		System.out.println("Channel : "+ch);
	}

}
