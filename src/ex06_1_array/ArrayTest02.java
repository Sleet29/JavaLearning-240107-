package ex06_1_array;
import java.util.*;
public class ArrayTest02 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int[] A = new int[5];
		int sum=0;
		float avg=0f;
		
		System.out.println("정수 5개를 입력하세요? ");
		for(int i=0;i<A.length;i++) {
			A[i] =sc.nextInt();
			sum +=A[i];
			avg =(float)sum/5;
		}
		
		sc.close();
		System.out.println("합 = "+sum);
		System.out.println("평균 = "+avg);
		
		
	}

}
