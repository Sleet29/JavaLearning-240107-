package ex04_12_conditional_op;
import java.io.InputStream;
import java.util.Scanner;

// 조건 연산자
public class ConditionalOpExample1_combine {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		System.out.print("3개의 정수를 입력 하세요 > ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max1, max2 ;
		int min1, min2 ;
		
		max1 = (num1 > num2) ? num1 : num2;
		max2 = (max1 > num3) ? max1 : num3;
				
		System.out.println("max = "+max2);
		System.out.println(num1+","+num2+","+num3+" 중 가장 큰 수는 " +max2+"입니다.");
		
		min1 = (num1 < num2) ? num1 : num2;
		min2 = (min1 < num3) ? min1 : num3;
		
		System.out.println("min= "+min2);
		System.out.println(num1+","+num2+","+num3+" 중 가장 작은수는 "+min2+"입니다.");
		
		sc.close();
	}

}
