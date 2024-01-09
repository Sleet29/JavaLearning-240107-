package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3_2_2 {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);

		System.out.println("나이를 입력하세요 > ");
		int age = sc.nextInt();

		if ((age / 10) == 0 && age !=0) {
			System.out.println("10세 미만");
		} else if ((age / 10) == 1) {
			System.out.println("10대");
		} else if ((age / 10) == 2) {
			System.out.println("20대");
		} else if ((age / 10) == 3) {
			System.out.println("30대");
		} else if ((age / 10) == 4) {
			System.out.println("40대");
		} else if (age==0) {
			System.out.println("허용 범위를 벗어났습니다.");
		}
		else {
			System.out.println("허용 범위를 벗어났습니다.");
		}
		sc.close();
	}

}
