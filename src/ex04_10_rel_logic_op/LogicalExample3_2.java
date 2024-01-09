package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3_2 {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);

		System.out.println("나이를 입력하세요 > ");
		int age = sc.nextInt();

		if ((age / 10) == 0) {
			System.out.println("10세 미만");
		} 
		else {
			System.out.println(age/10+"0대");
		}
		sc.close();
	}

}
