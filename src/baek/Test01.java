package baek;
import java.util.Scanner;

public class Test01 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[5];
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        	sum=sum+arr[i]*arr[i];
        }
        
        sc.close();
        
        int check=sum%10;
        
        System.out.println(check);
        
    }
}

