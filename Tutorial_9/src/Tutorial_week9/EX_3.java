package Tutorial_week9;

public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
			};
		
		for (int r = 0; r<array.length; r++) {
			for (int c =0; c<array[r].length; c++) {
				System.out.println(r+"��"+c+"�� : "+array[r][c]);
			}
			
		}
		}
	}

