package ex05_2_switch;
import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample2_1_String2 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner	sc = new Scanner(is);
		
		
		System.out.print("점수를 입력하세요! : ");
		int score=sc.nextInt();
		
		
		if(score <0 || score>100) {
			System.out.println("허용 범위를 벗어났습니다. 다시 입력하세요!");
		} else {
		
		int realscore =(score/5);
		
		switch(realscore) {
		
		case 20 :
		case 19 :
			System.out.print("A+");
			break;
			
		case 18 :
			System.out.print("A0");
			break;
							
		case 17 :
			System.out.print("B+");
			break;
			
		case 16 :
			System.out.print("B0");
			break;
		
		case 15 :
			System.out.print("C+");
			break;
		
		case 14 :
			System.out.print("C0");
			break;
		
		case 13 :
			System.out.print("D+");
			break;
		
		case 12 :
			System.out.print("D0");
			break;
			
		default :
			System.out.print("F");
		}
		System.out.println("학점");
		}
	
		sc.close();
	}

}
