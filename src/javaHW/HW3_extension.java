package javaHW;
import java.util.Scanner;

public class HW3_extension {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요 : ");
		int score =sc.nextInt();
		
		System.out.println("입력값"+"\t"+"출력값");
		System.out.println("======================");
		System.out.print(score+"\t");
		System.out.println((score-1)/10*10);
				
		sc.close();
	}

}
