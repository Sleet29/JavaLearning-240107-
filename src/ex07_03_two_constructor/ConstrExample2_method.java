package ex07_03_two_constructor;
public class ConstrExample2_method {
	public static void main(String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("연흥부","poorman","zebi");
		print(obj1);
		
		SubscriberInfo obj2 = new SubscriberInfo("연놀부","richman","money","02-123-4567","강남");
		
		print(obj2);
	}
	
	private static void print(SubscriberInfo obj1) {
		System.out.println("이름:"+obj1.name);
		System.out.println("아이디:"+obj1.id);
		System.out.println("패스워드:"+obj1.password);
		System.out.println("전화번호:"+obj1.phoneNo);
		System.out.println("주소:"+obj1.address);
		System.out.println("=================================");
	}

}
