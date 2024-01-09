package ex07_13_static_field1;
class Accumulator {
	int total = 0;
	static int grandTotal = 0;
	
	void accumulate(int amount) {
		total += amount;
		
		// 정적 필드에 amount 파라미터 값을 더하는 대입문
		grandTotal += amount;
	}
}