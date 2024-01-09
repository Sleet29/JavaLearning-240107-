package ex05_2_switch;

public class SwitchExample2_1_String {
	public static void main(String args[]) {
		String str = "포도"; // "G"
		
		switch (str) {
		case "사과" :
		System.out.println("A");
			break;
			
		case "배" :
			System.out.println("P");
			break;	
			
		case "포도" :
			System.out.println("G");
			break;
			
		default :
			System.out.println("?");
		}
		System.out.println("끝.");
	}

}
