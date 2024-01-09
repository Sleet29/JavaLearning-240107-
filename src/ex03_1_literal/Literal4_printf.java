package ex03_1_literal;

public class Literal4_printf {

	public static void main(String args[]) {
		System.out.printf("%f",42.195); // %f는 소수점 아래 6자리
		System.out.println(); //줄 변경
		System.out.printf("%.2f\n",42.195);
		// 소수점도 포함
		System.out.printf("%6.3f%n",42.195);
		System.out.printf("%7.3f%n",42.195);
		
		// 정수 출력
		System.out.printf("%d\n",42);
		// 정수 출력(%10d) - 총 10칸 차지함
		System.out.printf("%10d%n",42);
		System.out.printf("%d%n",42);
		
		// 문자 'A'를 문자 서식으로 출력
		System.out.printf("%c%n",'A');
		
		// 문자열 "홍길동" 출력
		System.out.printf("%s%n", "홍길동");
		
		// 문자열 "홍길동" 문자열 서식 (%10s)로 출력
		System.out.printf("%10s\n", "홍길동");
		
		// 문자열 "홍길동" 문자열 서식 (%-10s)로 출력
		System.out.printf("%-10s\n", "홍길동");
		
		System.out.printf("%s%n", "나의 이름은 홍길동, 나의 나이는 21세 입니다.");
		System.out.printf("%s", "나의 이름은");
		System.out.printf("%10s", "홍길동 ");
		System.out.printf("%s", ", 나의 나이는");
		System.out.printf("%6s", " 21세");
		System.out.printf("%s%n", " 입니다.");
		System.out.printf("%s", "나의 이름은 ");
		System.out.printf("%-9s", "홍길동 ");
		System.out.printf("%s", ", 나의 나이는");
		System.out.printf("%-6s", " 21세");
		System.out.printf("%s%n", " 입니다.");
		System.out.printf("%s%n","나의 이름은 홍길동, 나의 나이는 21세 입니다.");
		System.out.printf("%s%10s%s%6s%s%n","나의 이름은","홍길동",",나의 나이는","21세"," 입니다.");
		System.out.printf("%s%-10s%s%-6s%s%n","나의 이름은"," 홍길동",",나의 나이는 ","21세","입니다.");
		
		
	}
}
