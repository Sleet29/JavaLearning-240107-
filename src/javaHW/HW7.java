package javaHW;

public class HW7 {
	public static void main(String args[]) {
		int i;
		System.out.println("================= 2023년 12월 =================");
		System.out.printf("%36d%6d",1,2);
		System.out.println();
		for(i=3;i<32;i++) {
			System.out.printf("%6d",i);
			if(i%7==2) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
