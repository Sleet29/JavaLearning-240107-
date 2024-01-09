package ex07_08_final_field;
// private 필드를 갖는 클래스의 예
/*
 *
 */

class Circle2 {
	//private double raidus; 시 접근 권한의 제한 
	private double radius;
	
	final double PI = 3.14;
	
	Circle2(double radius){
		this.radius=radius;
	}
	
	double getArea() {
		return radius*radius*PI;
	}
	
	//getter 메서드
	public double getRadius() {
		return radius;
	}
	
	//setter 메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
}