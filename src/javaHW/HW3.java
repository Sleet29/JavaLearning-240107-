package javaHW;
import java.util.Scanner;

public class HW3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int score =sc.nextInt();
		System.out.println((score-1)/10*10);
				
		sc.close();
	}

}
