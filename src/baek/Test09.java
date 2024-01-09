package baek;
import java.util.Scanner;

public class Test09 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        
        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }
        
        for(int k=0;k<M;k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp;
            
            temp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }
        
        sc.close();
        
        for(int i=0;i<N;i++) {
        System.out.print(arr[i]+" ");
        }
        
    }
        
}
