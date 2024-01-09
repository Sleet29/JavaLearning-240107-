package ex04_07_concate_op;
import java.io.InputStream;
import java.util.Scanner;

public class HW3 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner	limit = new Scanner(is);
		
		System.out.print("limit를 입력하세요 : ");
		int limitNum = limit.nextInt();
		
		System.out.print("listcount를 입력하세요 : ");
		int listcount = limit.nextInt();
		
		System.out.print("maxpage = ");
		if((listcount % limitNum)==0){
			System.out.print("총 페이지수는 ");			
			System.out.print(listcount/limitNum);
			System.out.print(" 입니다.");
		} else {
			System.out.print("총 페이지수는 ");
			System.out.print(1+(listcount/limitNum));
			System.out.print(" 입니다.");
		}
		limit.close();
	}
	
}