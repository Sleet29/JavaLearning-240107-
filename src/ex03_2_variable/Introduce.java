package ex03_2_variable;
import java.util.Random;
public class Introduce {
	public static void main(String args[]) {
		
		Random random = new Random();
		String name = new String("송재혁");
		//int like_Num = 7;
		int randomNumber = random.nextInt(10) + 1;
		double left_eye = 1.2;
		double right_eye = 1.2;
		String favorite_food = new String("돈코츠라멘");
		String favorite_exercise = new String("수영");
		char alpha = 'S';
		boolean song = true;
		
		
		System.out.println("이름 : " + name);
		//System.out.println("좋아하는 숫자 : " + like_Num);
		System.out.println("좋아하는 숫자 : " + randomNumber);
		System.out.println("좌 시력 : " + left_eye);
		System.out.println("우 시력 : " + right_eye);
		System.out.println("좋아하는 음식 : " + favorite_food);
		System.out.println("좋아하는 운동 : " + favorite_exercise);
		System.out.println("좋아하는 알파벳 : " + alpha);
		System.out.println("당신은 노래를 좋아하나요? : " + song);
		
		
	}
}