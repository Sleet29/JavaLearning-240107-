package baek;
import java.util.*;
public class Test13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = A + B;

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + result);
        }

        sc.close();
    }
}