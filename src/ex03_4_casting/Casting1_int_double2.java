package ex03_4_casting;

public class Casting1_int_double2 {
	public static void main(String args[]) {
		
		double d2 = 10.12345;
		
		// 2. 명시적 형변환
		// 에러 발생 - Type mismatch: cannot convert from double to int
		int i2 = (int) d2; // 정수형 변수에 실수형 값을 저장할 수 없다.
					 	   // int i2 = d2;
		System.out.println("i2 데이터는  " + i2 + "입니다.");
		
	}

}
