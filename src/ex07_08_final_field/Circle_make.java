package ex07_08_final_field;
import java.util.*;
public class Circle_make {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Circle obj = new Circle(3.5);

		System.out.print("반지름을 입력하세요 > ");
		obj.radius=sc.nextDouble();

		sc.close();
		
		double area = obj.getArea();
		// private 접근 권한 제한
		System.out.println("원의 반지름 = "+obj.radius);
		System.out.println("원의 넓이 = "+area);
		
	}
}