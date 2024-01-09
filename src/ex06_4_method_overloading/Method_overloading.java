package ex06_4_method_overloading;

public class Method_overloading {
	// 매개변수 없는 메서드 - 1
	public static void print() {
		System.out.println("print()메서드 입니다.");
	}
	
	// 매개변수 한 개를 갖는 메서드 - 2
	public static void print(int num) {
		System.out.println("print(int num)메서드 입니다.");
	}

	// 매개변수 두 개를 갖는 메서드 - 3
	public static void print(int num, char data) {
		System.out.println("print(int num, char data)메서드 입니다.");
	}

	// 매개변수 두 개를 갖는 메서드 - 위와 다른점은 매개변수 자료형의 순서가 다릅니다. -4
	public static void print(char num, int data) {
		System.out.println("print(char num, int data)메서드 입니다.");
	
	// 3번과 동일 메서드로 취급
	// Duplicate method print(int, char) in type Method_overloading
		
		/*
		public static String print(int num,char data) {
			System.out.println("print(int num, char data)메서드 입니다.");
		}
		*/
	}

	public static void main(String args[]) {
		print();
		print(10);
		print(10, '*');
	}
}
