package ex03_1_literal;

public class Literal3_escape {

	public static void main(String args[]) {
		System.out.println("호호하하");
		System.out.println('"'+"호호하하"+'"'); // 30번줄 참고
		System.out.println("호호"+"\n"+"하하");
		System.out.println();
		System.out.println("호호하하"+'%'+'n');
						//or("호호하하%n");
		System.out.println("호호"+"\t"+"하하");
						//or("호호\t하하");
		System.out.println("호호"+"\\"+"하하");
		System.out.println("\'호호하하\'");
		// 슬래쉬 출력하고 싶을땐 "\\" >> \ 형태이다.
	}
}
