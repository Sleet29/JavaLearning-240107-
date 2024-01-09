package ex05_test;
import java.util.*;
public class Ex1_before {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int k = sc.nextInt();
		
		for(i=1;i<=k;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
