// Numbers 클래스를 사용하는 프로그램
package ex07_10_method_call;
public class Numbers_make_sc {
	public static void main(String args[]) {
		 int arr[] = {10,20,30,40,50};
		 Numbers obj = new Numbers(arr);
		 print(obj);
	}
	
	static void print(Numbers obj) {
		System.out.println("합계 = "+obj.getTotal());
		System.out.println("평균 = "+obj.getAverage());
	}

}


// 1. 1차원 정수형 배열 생성
// 2. Numbers(1번생성한 배열) 객체 생성
// 3. 출력결과
// 합계 = 150
// 평균 = 30



//메소드 집