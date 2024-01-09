package ex03_1_literal;
public class Literal1_println {
	public static void main(String args[]) {
		/*
		 * 1. System.out.println() : 괄호안의 내용을 출력한 후 한 행을 띄웁니다.
		 * 2. System.out.print() : 괄호안의 내용을 출력한 후 한 행을 띄지 않고 유지합니다.
		 * 3. System.out.printf() : 서식을 지정해서 출력
		 * 		형식: System.out.printf("포맷 명시자",데이터)
		 * 		주의점: %로 시작하는 포맷 갯수와 데이터 갯수가 일치해야 함.
		 */
		// 리터럴(literal) - 그 자체로 값을 의미 하는 것
		System.out.println("출력성공!!"); // 문자열
		System.out.println(30); // 정수
		System.out.println(3.14); // 실수
		System.out.println('A'); // 문자
		System.out.println(true); // 논리(불린)
		System.out.println(false);
		System.out.println("문자열 출력"); // 문자열
		System.out.println("====== println() 끝 ======"); // 문자열
		System.out.printf("%f", 0.2);
		
	}
}
