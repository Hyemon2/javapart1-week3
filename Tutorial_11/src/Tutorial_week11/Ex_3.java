package Tutorial_week11;

public class Ex_3 {
	public static class Car {
		String color;
		int gear;
		int speed;
		public void speedUp() {
			speed = speed+10;
		}

		public void changeGear(int gear) {
			this.gear = gear;
		}

		public String toString() {
			return "Car [color : " + color +", speed : " + speed + ", gear : " + gear + "]";
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.changeGear(3);
		myCar.speedUp();
		System.out.println(myCar);
	}
}