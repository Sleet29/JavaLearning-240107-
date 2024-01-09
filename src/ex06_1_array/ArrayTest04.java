package ex06_1_array;
import java.util.*;
public class ArrayTest04 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 5개를 입력하세요?");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	
	sc.close();
	
	int[] A = new int[5];
	
	A[0]=a;
	A[1]=b;
	A[2]=c;
	A[3]=d;
	A[4]=e;
	int min = A[0];
	int max = A[0];
	
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
