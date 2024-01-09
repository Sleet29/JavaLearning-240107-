package ex07_00_object;

public class Saram_make3 {
	public static void main(String args[]) {
		//The constructor Saram3() is undefined	Sarma_make3.java	/Java/src/ex07_00_object	line 5	Java Problem

		// (오류발생) Saram3 s = new Saram3();
		Saram3 s1 = new Saram3("아이유");
		Saram3 s2 = new Saram3("장범준");
		
		s1.w=0.0;
		s1.ki=200.0;
		s1.age=23;
		s1.eat();
		
		s2.w=64.0;
		s2.ki=172.0;
		s2.age=36;
		s2.eat();
	}
}