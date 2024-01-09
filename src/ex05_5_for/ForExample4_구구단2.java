package ex05_5_for;
import java.util.Scanner;
public class ForExample4_구구단2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int j;
				
		System.out.print("원하는 단을 입력 하세요 > ");
		int i=sc.nextInt();
		sc.close();
		System.out.println("["+i+"단]");
			for(j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
	}
}