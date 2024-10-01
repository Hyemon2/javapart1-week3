package Tutorial_week10;

public class EX_1 {

	public static void main(String[] args) {
		int[] Original ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("Original : ");
		for(int i =0; i<Original.length; i++) {
			System.out.print(Original[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse : ");
		for(int i =Original.length-1; i>=0; i--) {
			System.out.print(Original[i]+" ");
			
		}
	}

}
