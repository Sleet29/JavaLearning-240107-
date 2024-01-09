package ex03_2_variable;

public class Variable1_int {
	public static void main(String args[]) {
		System.out.println("==============정수형 변수==============");
		// 정수형 변수
		byte b = 10; // 1바이트(작은 범위 값 저장하기 유용)
		
		short s = 100; // 2바이트
		
		int i = 1000; // 4바이트
		
		// 8바이트(l[소문자 L] 또는 L을 숫자 뒤에 붙임)
		long l = 1000L;
		
		System.out.println(b); // 변수 b값 출력
		System.out.println("b=" + b); // +는 더하기 개념이 아닌 문자열 연결의 개념 
		System.out.println("s=" + s +"\n"+"i=" + i + " l=" + l);
		
		System.out.println("b=" + b + 1);
		// 위에 언급했듯이 문자열로 연결하기에 101이아닌 10+1의 형태로 출력
		
		System.out.println("b=" + (b + 1) );
		System.out.println("s=" + (s + 1) );
		
	}
}