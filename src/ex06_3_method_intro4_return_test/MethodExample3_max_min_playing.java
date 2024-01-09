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

public class MethodExample3_max_min_playing {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 정수를 입력하실 건가요? > ");
        int expectedCount = sc.nextInt();
        int arr[] = new int[expectedCount];

        sc.nextLine();  // 개행 문자 처리

        System.out.print("정수를 입력하세요! > ");
        for (int i = 0; i < expectedCount; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("잘못 입력했습니다! 정수 개수를 확인해주세요.");
                sc.close();
                return;
            }
        }

        if (sc.hasNextLine()) {
            // 입력받은 줄의 개수가 기대한 값과 다를 때
            System.out.println("잘못 입력했습니다! 정수 개수를 확인해주세요.");
            sc.close();
            return;
        }

        System.out.println("max = " + findmax(arr));
        System.out.println("min = " + findmin(arr));

        sc.close();
    }

    public static int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
	
}
