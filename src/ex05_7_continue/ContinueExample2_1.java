package ex05_7_continue;

public class ContinueExample2_1 {
	public static void main(String args[]) {
		// 0부터 9까지 1씩 증가되는 출력문 작성
		// 단, 5는 출력하지 않음
	
	
	for (int i=0; i<10 ; i++) {
		if (i !=5)
			System.out.println(i);
	
	}
	System.out.println("==============================");
	
	for (int i=0;i<10;i++) {
		if(i==5)
		continue;
		
		System.out.println(i);
		}
	
	System.out.println("End.");
	}
}
