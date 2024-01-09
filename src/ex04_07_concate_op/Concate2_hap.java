package ex04_07_concate_op;
// 문자열의 연결
public class Concate2_hap {
	public static void main(String args[]) {
		String str1 = "hap=" + 3 + 4;
		System.out.println(str1);
		
		String str2 = 3 + 4 + "=hap";
		System.out.println(str2);
		
		String str3 = "hap=" + (3 + 4);
		System.out.println(str3);
	}

}
