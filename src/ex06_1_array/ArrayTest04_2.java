package ex06_1_array;
import java.util.*;
public class ArrayTest04_2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 5개를 입력하세요?");
		
	int[] A = new int[5];
	
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	
	int min = A[0];
	int max = A[0];
	
	sc.close();
	
	for(int i=0;i<A.length;i++) {
		if(A[i]>max) {
			max=A[i];
		}
		
		if(A[i]<min) {
			min=A[i];
		}
	}
	
	System.out.println("max = "+max);
	System.out.println("min = "+min);
	
	
	
	}
}
