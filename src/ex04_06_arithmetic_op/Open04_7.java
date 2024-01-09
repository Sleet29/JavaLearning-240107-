package ex04_06_arithmetic_op;
import java.io.InputStream;
import java.util.Scanner;

public class Open04_7 {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc	=	new		Scanner(is);
		
		System.out.print("정수1을 입력 하세요 > ");
		int a = sc.nextInt();
		
		System.out.print("정수2를 입력 하세요 > ");
		int b = sc.nextInt();
		int d = a + b;
		
		System.out.print("연산자(+)를 입력하세요 > ");
		String c = sc.next();
		
		if ( c.equals("+")  ) {
			System.out.println(a + " + "+ b +" = " + d);
		} else {
			System.out.println("+를 입력하세요");
			
		}
		sc.close();
		}
	
}

