package ex07_00_object;

public class Saram_make {
	public static void main(String args[]) {
/*
 * 다른 클래스에 있는 필드나 메서드를 사용하려면 먼저 객체를 생성해야 합니다.
 * 생성된 객체 멤버에 접근하려면 마침표(.)연산자를 사용합니다.
 * 예) 참조변수.필드, 참조변수,메서드()
 */
		// 클래스		참조변수		=		연산자		생성자호출
		Saram2 s1 =	new	Saram2();
		Saram2 s2 = new Saram2();
		
		s1.name="아이유";
		s1.w=0.0;
		s1.ki=200.0;
		s1.age=23;
		s1.eat();
		s1.sesu();
		s1.sing();
		
		s2.name="장범준";
		s2.w=64.0;
		s2.ki=172.0;
		s2.age=36;
		s2.eat();
		s2.sesu();
		
	}
}