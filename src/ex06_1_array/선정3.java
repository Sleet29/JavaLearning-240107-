package ex06_1_array;

public class 선정3 {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		
		int n = arr.length;
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int i=0;i<n-1;i++) {
			int index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
				
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	}        
}
