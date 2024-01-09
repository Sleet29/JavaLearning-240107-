package ex06_2_method;

public class MethodExample11 {
	// 접근제어자		객체생성없이 접근가능	반환되는 값의 자료형			메서드이름(매개변수 목록)
		public	 		static				  void				main(String args[]) {
			int num=20;
			char data='*';
			// num 변수가 갖고 있는 값을 print()안에서 출력하려면 어떻게 해야 할까요?
			print(num,data);
			return;	// 여기서 main()메서드를 종료합니다.
		}
	
		// 메서드 정의						//매개변수 = parameter
		public static void print(int p_num, char p_char) {
			for(int i=0;i<p_num;i++) {
				
			System.out.print(p_char);
			}
			
			return; // 반환되는 값의 자료형이 void면 이 문장 생략 가능.
		}
}