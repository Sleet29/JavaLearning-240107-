package ex05_7_continue;

public class ContinueExample1 {
	public static void main(String args[]) {
	
		int cnt=0;
		while(cnt<10) {
			if(cnt++==5)
				continue;
			System.out.println(cnt-1);
			
		}
		System.out.println("끝. ");
	}
}
