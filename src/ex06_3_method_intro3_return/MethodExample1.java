package ex06_3_method_intro3_return;

public class MethodExample1 {
	public static void main(String args[]) {
		hap(1,10);
		
		// 1. return sum의 값을 저장해서 출력하는 방법
		int result = hap(1,100);
		System.out.println("1: result = "+result);
		
		// 2. 출력문에서 메서드 호출하는 방법
		System.out.println("2: result = "+hap(1,5));
	}
				  //반환형
	public static int hap(int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		
		
		return sum;//sum의 자료형과 메서드 반환형이 일치해야 합니다.
	}
	
}