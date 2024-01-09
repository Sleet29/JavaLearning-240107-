package ex04_06_arithmetic_op;
import java.io.InputStream;
import java.util.Scanner;

// import java.io.InputStream;
// import java.util.Scanner;
// ctrl + shift + o (import 안 이루어진 클래스 모두 찾아서 자동으로)

public class Oper02_input {
	public static void main(String args[]) {
	// System.in은 키보드로 데이터를 입력 받을때 사용합니다.
	// InputStream java.lang.System.in
	InputStream is = System.in;
	
	//java.util.Scanner.Scanner(InputStream source)
//	클래스명		참조형 변수	연산자		생성자 호출
	Scanner 		sc	=	new		Scanner(is);
	
	System.out.print("정수를 입력 하세요> ");
	int a = sc.nextInt(); // 정수를 읽어 변수 a에 저장합니다.
	
	System.out.println("입력값은 " + a + "입니다.");
	
	System.out.print("정수를 입력 하세요> ");
	int b = sc.nextInt();
	System.out.println("입력값은 " + b + "입니다.");
	
	sc.close();
	}

}
