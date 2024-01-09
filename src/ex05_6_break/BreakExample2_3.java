package ex05_6_break;
import java.util.*;
public class BreakExample2_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		
		System.out.println("두 수와 사칙연산 연산자를 입력하세요");
		System.out.print("수1 > ");
		int a = sc.nextInt();
		System.out.print("수2 > ");
		int b = sc.nextInt();
		System.out.print("연산자 > ");
		String c = sc.next();
		
		if(c.equals("+")){
			System.out.println(a+c+b+"="+(a+b));
		} else if(c.equals("-")) {
			System.out.println(a+c+b+"="+(a-b));
		} else if(c.equals("*")) {
			System.out.println(a+c+b+"="+(a*b));
		} else if(c.equals("/")) {
			System.out.println(a+c+b+"="+(a/b));
		} else {
			System.out.println(a+c+b+"="+(a%b));
		}
		System.out.println("계속 입력하시겠습니까? ");
		String d = sc.next();
			
		
		if(d.equals("n") || d.equals("N")) {
			break;
		}
		
		}
		System.out.println("끝.");
		
		sc.close();
		
	}
}