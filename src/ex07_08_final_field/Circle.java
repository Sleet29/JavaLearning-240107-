package ex07_08_final_field;

public class Circle {
	//private double raidus; 시 접근 권한의 제한 
	double radius;
	
	final double PI = 3.14;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double getArea() {
		return radius*radius*PI;
	}
}