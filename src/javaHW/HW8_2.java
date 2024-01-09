package javaHW;

public class HW8_2 {
	public static void main(String args[]) {
		int i,j;
		
		for(i=9;i>0;i=i-2) {
			for(j=0;j<i;j+=2) {
				System.out.print(" ");
			}
			for(j=10;j>i;j--) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}