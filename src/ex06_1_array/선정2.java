package ex06_1_array;

public class 선정2 {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
	        
	        System.out.println("원래 배열:");
	        printArray(arr);
	        
	        selectionSortReverse(arr);
	        
	        System.out.println("\n역순 정렬된 배열:");
	        printArray(arr);
	    }

	    static void selectionSortReverse(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // 최솟값을 현재 위치로 옮김
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // 배열을 출력하는 메서드
	    static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
