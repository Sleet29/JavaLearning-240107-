package baek;
import java.util.*;
public class Test15 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i=0;i<T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A + B;
		}
		sc.close();
		
		for(int i=0;i<T;i++) {
		//	System.out.println("Case #"+(i+1)+" : "+A+B+arr[i]);
		}
    } 
}