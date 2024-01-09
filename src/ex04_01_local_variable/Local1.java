package ex04_01_local_variable;
/*
 혹시 main(String[] arg) 와 main (String arg[])의 차이점이 있나요?
 */
// local variable - method 안에 정의된 변수
public class Local1 {
	public static void main(String args[]) {
		int num; // local variable (지역변수)
		num = 10 + 20;
		System.out.println(num);
	}
}