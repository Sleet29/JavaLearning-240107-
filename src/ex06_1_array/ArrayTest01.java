package ex06_1_array;

public class ArrayTest01 {
	public static void main(String args[]) {
		int[] A = {95,70,80,75,100};
		int sum=0;
		
		for(int i =0;i<A.length;i++) {
		System.out.println("score["+i+"]="+A[i]);
		sum += A[i];
		}
		System.out.println("총점="+sum);
		
		
	}

}
