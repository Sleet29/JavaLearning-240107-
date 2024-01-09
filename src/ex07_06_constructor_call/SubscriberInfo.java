package ex07_06_constructor_call;

public class SubscriberInfo {
	String name,id,password;
	String phoneNo,address;
	
	SubscriberInfo(){
		
	}

	SubscriberInfo(String name,String id, String password){
		this.name = name;
		// 필드
		this.id = id;
		this.password = password;
	}
	
	SubscriberInfo(String name,String id, String password,String phoneNo,String address){

		// this() : 같은 클래스의 다른 생성자를 호출할 때 사용합니다.
		// String 타입의 파라미터 3개를 갖는 생성자를 호출
		
		this(name,id,password); // Constructor call must be the *first statment*(첫번째줄) in a construct
		this.phoneNo=phoneNo;
		this.address=address;
	}
	
	void changePassword(String password){
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
}
