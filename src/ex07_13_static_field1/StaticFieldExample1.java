package ex07_13_static_field1;

public class StaticFieldExample1 {
	public static void main(String args[]) {
		// 정적 변수 사용법 : 클래스명.정적변수
		System.out.println("정적 변수 grandTotal = "+Accumulator.grandTotal);
		// out에 static 붙었음
		
		Accumulator obj1 = new Accumulator();
		obj1.accumulate(10);
		System.out.println("obj1.total = "+ obj1.total);
		System.out.println("obj1.grandTotal = "+obj1.grandTotal);
		// 틀린건 아니지만 클래스명으로 접근해라.
		System.out.println("Accumulator.grandTotal = "+Accumulator.grandTotal);
		
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(20);
		System.out.println("============================================");
		System.out.println("obj1.total = "+ obj2.total);
		System.out.println("obj1.grandTotal = "+obj2.grandTotal);
		System.out.println("Accumulator.grandTotal = "+Accumulator.grandTotal);
		
	}

}
