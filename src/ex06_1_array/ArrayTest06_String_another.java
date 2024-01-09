/*
		String names[] = {"홍길동", "전우치", "홍길동", "세종대왕", "김길동"};
		String inputname = sc.next();
		
		실행1. 배열 요소의 값 입력한 경우
		실행결과화면)
		검색할 이름을 입력하세요?
		이름 : 홍길동
		홍길동는(은) 배열의 인덱스 0에서 찾았습니다.
		
		실행2. 배열 요소의 값이 아닌 데이터를 입력한 경우
		실행결과화면)
		검색할 이름을 입력하세요?
		이름:HTA
		HTA는(은) 배열방에서 찾지 못했습니다.
		 */
package ex06_1_array;
import java.util.*;
public class ArrayTest06_String_another {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String names[] = {"홍길동", "전우치", "홍길동", "세종대왕", "김길동",};
		
		System.out.println("검색할 이름을 입력하세요? ");
		System.out.print("이름 : ");
		String inputname = sc.next();
		int index = -1;
		
		sc.close();
		
		for (int i = 0;i<names.length;i++) {
			if(inputname.equals(names[i])) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			System.out.println(inputname + "은 배열의 인덱스"+ index + "에서 찾았습니다.");
		} else // 찾지 못했을 때
			System.out.println(inputname + "은 방에서 찾지 못했습니다.");
	}
}