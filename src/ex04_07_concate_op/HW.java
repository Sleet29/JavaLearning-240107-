package ex04_07_concate_op;
import java.io.InputStream;
import java.util.Scanner;

public class HW {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner	sc = new Scanner(is);
		
		System.out.println("정수를 입력하세요 > ");
		int a = sc.nextInt();
		
		System.out.println("입력값"+"\t"+"\t"+"출력값");
		System.out.println("======================");
		System.out.println(a+"\t"+"\t"+a/10);
		
		sc.close();
	}

}
