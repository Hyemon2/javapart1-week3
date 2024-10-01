package Tutorial_week11;

public class Ex_2 {
	public static class Television {
		int channel;
		int volume;
		boolean onOff;
		
		public void print() {
			System.out.print("Channel : "+channel);
			System.out.print(" volume : "+volume);
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		Television myTv_1 = new Television();
		myTv_1.channel = 7;
		myTv_1.volume = 9;
		myTv_1.onOff = true;
		myTv_1.print();
		
		Television myTv_2 = new Television();
		myTv_2.channel = 10;
		myTv_2.volume = 11;
		myTv_2.onOff = true;
		myTv_2.print();

		
	}

}
