package baek;
import java.util.Scanner;

public class Test01_02 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++) {
        	arr[i]=sc.nextInt();
        }
        
        int b = sc.nextInt();
        
        
        for(int i=0;i<N;i++) {
        if(b==arr[i]) {
        	count+=1;
        	}
        }
        sc.close();
        
        System.out.println(count);
    }
}

