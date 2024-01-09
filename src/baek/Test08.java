package baek;
import java.util.Scanner;

public class Test08 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        
        sc.close();
        
        int max = arr[0];
        
        for(int i=0;i<9;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
        	}
        }
        
        int count=0;
        
        for(int i=0;i<9;i++) {
        	if(arr[i]==max) {
        		count+=i;
        		
        	}
        }
        
        System.out.println(max);
        System.out.println(count+1);
        
    }
}