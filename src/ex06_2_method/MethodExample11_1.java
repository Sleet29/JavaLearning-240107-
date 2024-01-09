package ex06_2_method;

public class MethodExample11_1 {
	// 접근제어자		객체생성없이 접근가능	반환되는 값의 자료형			메서드이름(매개변수 목록)
		public	 		static				  void				main(String args[]) {
		
			int[] num = {1,2,3,4,5};
			print(num);
			
			return;	// 여기서 main()메서드를 종료합니다.
		}
	
		public static void print(int[] p_num) {
			for (int num: p_num) {
				System.out.print(num+" ");
			}
			return; // 반환되는 값의 자료형이 void면 이 문장 생략 가능.
		}
}