package ex05_6_break;

public class BreakExample2_2 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				System.out.println("("+i+","+j+")");
				if ((i==1) && (j==2))
					break;
			}
			if(i==1) {
				break;
			}
		}
		System.out.println("끝.");
	}
}