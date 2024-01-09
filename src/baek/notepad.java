package baek;
import java.util.*;
public class notepad {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		int[] full = new int[30];
		int[] arr = new int[28];
		
		for(int i=0;i<28;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0;i<30;i++) {
			full[i] = i;
		}
		
		for(int i=0;i<28;i++) {
			for(int j=0;j<30;j++) {
				if(full[j]==arr[i]) {
					System.out.println(i+1);
				}
			}
		}
	}
}