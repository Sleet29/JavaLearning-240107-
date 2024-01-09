package ex05_1_if;
import java.io.InputStream;
import java.util.Scanner;

public class IfExample6 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("점수를 입력하세요 > ");
		int score=sc.nextInt();
		
		if(score>=90) {
			System.out.println("A학점");
		}else if(score>=80 && score<90) {
			System.out.println("B학점");
		}else if(score>=70 && score<80) {
			System.out.println("C학점");
		}else if(score>=60 && score<70) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		sc.close();
	}

}
