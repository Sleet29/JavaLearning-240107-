package ex06_1_array;

public class ArrayTest01_1 {
	public static void main(String args[]) {
		int[] score = new int[5];
		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;
		
		int sum = 0;
		// int[] score = {95,70,80,75,100};와 같은 의미
		
		System.out.println("score[0]=" + score[0]);
		System.out.println("score[1]=" + score[1]);
		System.out.println("score[2]=" + score[2]);
		System.out.println("score[3]=" + score[3]);
		System.out.println("score[4]=" + score[4]);
		
		for(int i=0;i<score.length;i++) {
			sum +=score[i];
		}
		float avg = sum/(float)score.length;
		System.out.println("총합 = "+sum);
		System.out.println("평균 = "+avg);
	}
}