package baek;
import java.util.Scanner;

public class Test02 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        
        int a = sc.nextInt();
        int count = 0;
        for(int i=0;i<N;i++){
            if(a==arr[i]){
                count++;
            }
        }
        
        sc.close();
        System.out.print(count);
        
    }
}
