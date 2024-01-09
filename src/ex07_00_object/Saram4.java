package ex07_00_object;

class Saram4 {
	String name;
	double w;
	double ki;
	int age;
	
	// 생성자도 Overlodaing 가능
	/*
	Saram3(){
	}
	*/
	
	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 함.
	Saram4(String name2,double w2){
		name=name2;
		w=w2;
	}
	
	
	// 메서드
	public void eat() {
		System.out.println(name +"이(가) 밥을 먹는다.");
	}
	// name을 메서드 내에서 사용가능
	
	// 메서드
	public void walk() {
		System.out.println(name +"이(가) 걷는다.");
	}
	
	// 메서드
	public void sesu() {
		System.out.println(name + "이(가) 세수한다.");
	}
	
	
	
	public void sing() {
		System.out.println(name + "이(가) 노래한다.");
	}
	

}
