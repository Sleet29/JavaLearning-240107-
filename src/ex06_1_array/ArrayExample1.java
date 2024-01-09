package ex06_1_array;

public class ArrayExample1 {
	public static void main(String args[]) {
		int[] arr;
		arr = new int[10];
	
		// 배열 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0]+arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]); // 배열 초기값 0
		
		//java.lang.ArrayIndexOutOfBoundsException : 10
		//System.out.println(arr[10]); // 오류 발생
		//범위가 0~9의 10개지 10은 포함X
	}
	

}
