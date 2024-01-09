package ex07_14_static_final;

public class LimitedValue {
	// final 과 static 위치 바꾸어도 됨
	// final static int UPPER_LIMIT = 100000;// 상수 필드의 선언
	static final int UPPER_LIMIT = 100000;
	int value;
	
	void setValue(int value) {
		if(value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;
	}

}
