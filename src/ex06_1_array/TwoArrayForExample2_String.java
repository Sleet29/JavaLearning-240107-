package ex06_1_array;

public class TwoArrayForExample2_String {
	public static void main(String args[]) {
		String arr[][]= {{"과일", "사과" },
				{"아이스크림","메로나"},
				{"커피"}};
		
		// 향상된 for문
		for(String n : arr[0]) {
			System.out.println(n);
		}
		
		System.out.println("======================");
		for(String[] a: arr) {
			for(String b: a) {
				System.out.printf("%s\t", b);
			}
			System.out.println();
		}
	}

}
