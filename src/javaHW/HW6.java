package javaHW;
import java.io.InputStream;
import java.util.Scanner;

public class HW6 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner	limit = new Scanner(is);
		
		System.out.print("limit를 입력하세요 : ");
		int limitNum = limit.nextInt();
		
		System.out.print("listcount를 입력하세요 : ");
		int listcount = limit.nextInt();
		
		System.out.print("maxpage = ");
		System.out.println((listcount-1)/limitNum+1);
		limit.close();
	}
	
}