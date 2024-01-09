package ex07_00_object;

public class Saram_make6 {
	public static void main(String args[]) {
		//The constructor Saram3() is undefined	Sarma_make3.java	/Java/src/ex07_00_object	line 5	Java Problem

		// (오류발생) Saram3 s = new Saram3();
		Saram6 s1 = new Saram6("아이유",0.0,200.0,23);
		Saram6 s2 = new Saram6("장범준",64.0,172.0,33);
		
		// s.name = "아이유";
		// s1.w=0.0;
		//s1.ki=200.0;
		//s1.age=23;
		s1.eat();
		s1.walk();
		
		s2.w=64.0;
		s2.ki=172.0;
		s2.age=36;
		s2.eat();
		s2.walk();
	}
}