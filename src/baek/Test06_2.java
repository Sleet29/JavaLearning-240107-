package baek;
import java.util.Scanner;

public class Test06_2 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int A=0;A<M;A++) {
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        for(int a = (i-1);a<j;a++) {
        	arr[a]=k;
        	}
        }
        
        sc.close();
        
        for(int i=0;i<N;i++) {
        System.out.print(arr[i]+" ");
        }
	}
}
