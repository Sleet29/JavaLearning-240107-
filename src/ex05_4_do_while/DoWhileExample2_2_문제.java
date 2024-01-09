package ex05_4_do_while;
import java.util.Scanner;
public class DoWhileExample2_2_문제 {
	public static void main(String args[]) {
		String location="";
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("지역입력(exit=q) > ");
		location = sc.next();
			
		System.out.println("입력하신 지역은 "+location+ "입니다.");
		} while(!location.equals("q")); {
			System.out.println("끝. ");
		}
		sc.close();
	}

}
