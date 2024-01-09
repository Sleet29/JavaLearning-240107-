package ex04_13_comAssign;

public class CompAssignmentExample1 {
	public static void main(String args[]) {
		int res=10, a=2;
		res += a; // res = res + a; 10+2=12
		System.out.println(res);
		
		res -= a; // res = res - a; 12-2=10
		System.out.println(res);
		
		res *= a; // res = res * a; 10*2=20
		System.out.println(res);
		
		res /= a; // res = res / a; 20/2=10
		System.out.println(res);
		
		int num = 29;
		num -= 2 + 3 * 4; // 뒤에 수식을 먼저 다 계산하고 복합대입 연산자 계산
		System.out.println(num);
	}
}
