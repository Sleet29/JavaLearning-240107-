package ex05_5_for;

public class For01 {
	public static void main(String args[]) {
		int i;
		System.out.println("1~10 사이의 홀수 출력입니다.");
			System.out.println("========================");
			for(i=1;i<=10;i+=2) {
			System.out.printf("%-5d",i);
		}
			System.out.println();
			System.out.println();
		
		System.out.println("1~10 사이의 짝수 출력입니다.");
			System.out.println("========================");
			for(i=2;i<=10;i+=2) {
			System.out.printf("%-5d",i);
		}
			System.out.println();
			System.out.println();
		
		System.out.println("1~10의 합 출력입니다.");
			System.out.println("========================");
			int sum=0;
			for(i=1;i<11;i++) {
				sum=sum+i;
			}
			System.out.println(sum);
			System.out.println();
			
		System.out.println("1~10의 홀수합 출력입니다.");
			System.out.println("========================");
			int sum2=0;
			for(i=1;i<11;i+=2) {
				sum2=sum2+i;
			}
			System.out.println(sum2);
			System.out.println();
			
		System.out.println("1~10의 짝수합 출력입니다.");
			System.out.println("========================");
			int sum3=0;
			for(i=2;i<11;i+=2) {
				sum3=sum3+i;
			}
			System.out.println(sum3);
	}
}