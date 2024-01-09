package ex04_12_conditional_op;
// 조건 연산자
public class ConditionalOpExample1_min {
	public static void main(String args[]) {
		int a = 30, b = 10, min;
		
		//System.out.println(a < b ? a : b);
		
		min = a < b ? a : b;
		System.out.println("최솟값 = " + min);
	}

}
