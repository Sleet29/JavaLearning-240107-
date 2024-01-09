package ex07_15_static_method;
// private 필드를 갖는 클래스의 예
/*
 *
 */

class FieldExample1_method {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		print(obj);
		
		obj.radius  = 5.5;
		FieldExample1_method.print(obj);
	}
	
	public static void print(Circle circle) {
		//double are = circle.getArea();
		System.out.println("원의 반지름 = "+ circle.radius);
		System.out.println("원의 넓이 = "+ circle.getArea());
	}
}