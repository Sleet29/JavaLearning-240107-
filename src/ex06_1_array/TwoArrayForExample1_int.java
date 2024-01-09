package ex06_1_array;

public class TwoArrayForExample1_int {
	public static void main(String args[]) {
		int arr[][] = {	{10,20},
						{30,40},
						{50}
					  };
		
		int k=0;
		
		for(int[] i:arr) {
			for(int j : i) {
				System.out.print(j+" ");
				k++;
				if(k%2==0) {
					System.out.println();
				}
			}
		
		}
		System.out.println();
		System.out.println("==================");
		
	}
}