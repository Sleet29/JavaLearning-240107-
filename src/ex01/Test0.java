package ex01;
import java.util.*;
public class Test0 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int[] j = new int[i];
	    	    
	    for (int k=0;k<i;k++) {
		int l = sc.nextInt();
		int m = sc.nextInt();
		j[k]= l+m;
		}
	    sc.close();
	    
	    for (int o : j) {
	    	System.out.println(o);
	    }
	    
	}
}
