	package ex04_06_arithmetic_op;
	import java.io.InputStream;
	import java.util.Scanner;
	
	public class Open04_5 {
	
		public static void main(String[] args) {
			InputStream is = System.in;
			Scanner	sc = new Scanner(is);
			
			System.out.print("정수를 입력 하세요 > ");
			// 입력 받은 값을 정수형에 넣고 scan값에서 벗어나야 함
			int inputNumber = sc.nextInt();
			
			int pandan = inputNumber % 3;
			if (pandan == 0) {
				System.out.println(inputNumber + "(은)는 3의 배수 입니다.");
			} else {
				System.out.println(inputNumber + "(은)는 3의 배수가 아닙니다.");
			}
			sc.close();
			
		}
	}
