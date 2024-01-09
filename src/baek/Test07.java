package baek;
import java.util.Scanner;

public class Test07 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            arr[i]%=42;
        }
        
        sc.close();
        
        int count=0;
        
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
        }
        
        System.out.println(10-count);
        
    }
}

