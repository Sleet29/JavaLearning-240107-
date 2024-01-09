package baek;
import java.util.*;
public class Test12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = (N-1) / 4;
		sc.close();
		for(int i=1;i<=K+1;i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
		/*1~4 > 0~3 LONG INT
		5~8 > 4~7 LONG LONG INT
		9~12
		
		K+1번 LONG + INT
		*/
    } 
}