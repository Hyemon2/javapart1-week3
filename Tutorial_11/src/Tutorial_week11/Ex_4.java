package Tutorial_week11;

public class Ex_4 {
	public static class Rectangle {
		int width;
		int height;
		public double area() {
			double area = width*height;
			return area;
		}
		public double perimeter() {
			double perimeter = 2*(width+height);
			return perimeter;
		}
		public void modify(int i, int j) {
			width=i;
			height=j;
		}
		public void modifyRatio(int i) {
			width = width*i;
			height = height*i;
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		
		rect.width =10;
		rect.height =2;
		double area = rect.area();
		double perimeter = rect.perimeter();
		
		System.out.println("Current area : "+area);
		System.out.println("Current perimeter : "+perimeter);
		
		rect.modify(10,6);
		
		double modify_area =rect.area();
		double modify_perimeter = rect.perimeter();
		
		System.out.println("Modified area : "+modify_area);
		System.out.println("Modified perimeter : "+modify_perimeter);
		
		rect.modifyRatio(3);
		
		double modifyRatio_area = rect.area();
		double modifyRatio_perimeter =rect.perimeter();
		
		System.out.println("ModifiedRatio area : "+modifyRatio_area);
		System.out.println("ModifiedRatio perimeter : "+modifyRatio_perimeter);
	}
	

}
