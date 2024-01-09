package javaHW;
import java.util.Scanner;

public class HW5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("page를 입력하세요 : ");
		
		int score =sc.nextInt();
		System.out.println("startpage="+((score-1)/10*10+1));
				
		sc.close();
	}

}
