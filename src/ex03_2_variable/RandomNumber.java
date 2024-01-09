package ex03_2_variable;
import java.util.Random;

	public class RandomNumber {
	    public static void main(String[] args) {
	        // Random 객체 생성
	        Random random = new Random();

	        // 1부터 10까지의 랜덤한 숫자 생성
	        int randomNumber = random.nextInt(10) + 1;

	        // 생성된 랜덤 숫자 출력
	        System.out.println("랜덤한 숫자: " + randomNumber);
	    }
}

