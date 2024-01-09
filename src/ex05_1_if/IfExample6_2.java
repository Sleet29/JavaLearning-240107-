package ex05_1_if;
import java.io.InputStream;
import java.util.Scanner;

public class IfExample6_2 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("점수를 입력하세요 > ");
		int score=sc.nextInt();
		if (score>100 || score<0) {
			System.out.println("범위를 벗어났습니다. 다시 입력하세요");
		}
		else{
		
		int mok = score/10;
		
		
			if(mok>=9) {
				System.out.println("A학점");
			}else if(mok>=8) {
				System.out.println("B학점");
			}else if(mok>=7) {
				System.out.println("C학점");
			}else if(mok>=6) {
				System.out.println("D학점");
			}else {
				System.out.println("F학점");
			}
	}
		sc.close();
	}

}
