package javaHW;
import java.util.Arrays;
public interface HW11 {
	public static void main(String args[]) {
		int[] arr = {5,4,3,2,1};
		int tmp;
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}System.out.print(Arrays.toString(arr));
		}
		
		
		
		
	}

}
