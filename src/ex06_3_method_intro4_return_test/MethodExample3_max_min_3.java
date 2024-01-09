package ex06_3_method_intro4_return_test;
// 메서드 정의 순서는 상관없음
// 2개의 값을 입력 받아 최대,최소값 구하기
/*
 1. 최대값 구하는 메서드는 max
 2. 최소값 구하는 메서드는 min
 3. 두 메서드 모두 반환형은 int, 매개변수는 모두 정수형 2개
 4. main()에서 아래와 같은 작업을 진행합니다.
 	(1) 두 개의 값을 입력받습니다.
 	(2) 두 개의 값을 인자로 max(), min()을 호출 합니다.
 	(3) 호출 후 리턴된 값을 아래와 같이 출력되도록 합니다.
 		출력결과)
 			두 개의 정수를 입력하세요? 10 20
 			max = 20
 			min = 20
 */

import java.util.Scanner;

public class MethodExample3_max_min_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		int a = max(c,d);
		int b = min(c,d);
		
		System.out.println("max = "+a);
		System.out.println("min = "+b);
	}
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
		//return a>b? a:b
		
	}
	
	public static int min(int a, int b) {
		if(a<b) {
			return a;
		} else {
			return b;
		}
		
		//return a<b? a:b
		
	}

}
