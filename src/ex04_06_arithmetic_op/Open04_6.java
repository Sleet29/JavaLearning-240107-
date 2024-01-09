package ex04_06_arithmetic_op;

public class Open04_6 {

	public static void main(String[] args) {
		int data = 10;
		int pandan = data % 3;
		System.out.println("data % 2의 값은 " + pandan + "입니다.");
		
		if (pandan == 0) {
			System.out.println(data + "(은)는 짝수 입니다.");
		} else {
			System.out.println(data + "(은)는 홀수 입니다.");
		}
	}
}
