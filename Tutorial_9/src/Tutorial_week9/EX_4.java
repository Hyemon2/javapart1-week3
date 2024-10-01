package Tutorial_week9;

import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[][]=new int[100][4];
		int count=0;
		System.out.println("학번 중간성적 기말성적 반복하여 입력(완료 후 -1 입력)");
		int stunum=sc.nextInt();
		while(stunum!=-1){ 
			int midsc=sc.nextInt();
			int finalsc=sc.nextInt();
			scores[count][0]=stunum;
			scores[count][1]=midsc;
			scores[count][2]=finalsc;
			count++;
			stunum=sc.nextInt();
		}
		for(int i =0; i<count; i++) {
			int total =scores[i][1]+scores[i][2];
			scores[i][3]=total;
		}
		for(int i=0; i<count-1;i++) {
			for(int j=0;j<count;j++) {
				if(scores[j][3]>scores[i][3]) {
					int[] temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		System.out.println("학번  중간성적  기말성적  총합");
	    for (int i = 0; i < count; i++) {
	      System.out.print(scores[i][0]+" ");
	      System.out.print(scores[i][1]+" ");
	      System.out.print(scores[i][2]+" ");
	      System.out.print(scores[i][3]);
	      System.out.println();
	    }
		int highscore=0;
		int highstunum = 0;
		for(int i = 0; i<count; i++) {
			if(scores[i][3]>highscore) {
				highscore =scores[i][3];
				highstunum=scores[i][0];
			}
		}
		System.out.println("가장 최고 점수를 받은 학생은 "+highstunum+"입니다.");
	}

}
