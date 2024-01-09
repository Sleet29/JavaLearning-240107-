package ex04_07_concate_op;


public class HW_extension {
	public static void main(String[] args) {
        // 1부터 30까지의 입력값에 따른 출력값 나열
		System.out.println("입력값"+"\t"+"  출력값");
		System.out.println("====================");
        for (int i = 1; i <= 100; i++) {
            int outputValue = i / 10;
            System.out.println("입력값: " + i + ", 출력값: " + outputValue);
        }
    }
		
		
}


