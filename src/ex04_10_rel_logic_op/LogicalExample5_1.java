package ex04_10_rel_logic_op;
public class LogicalExample5_1 {

	public static void main(String args[]) {
		// 논리 부정 연산자(!) 오른쪽 결과를 부정합니다.
		System.out.println(!true);
		System.out.println(!false);
		
		int a = 3, b = 4;
		
		if(a >= b) {
			System.out.println(a + " >= " + b);
		}
		
		if(!(a >= b)) {
			System.out.println(a + " < " + b);
		}
		
		if(a>=1 && a<=10) {
			System.out.println("a");
		}
		
		if(!(a>=1 && a<=10)) {
			System.out.println("b");
		}
	}

}
