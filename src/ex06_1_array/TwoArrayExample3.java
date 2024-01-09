package ex06_1_array;

public class TwoArrayExample3 {
	public static void main(String args[]) {
		int table[][]= {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
		
		
		/*
		
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[0].length;j++) {
				System.out.println("table["+i+"]"+"["+j+"]");
			}
		}
		*/
		
		int c=0,d=0;
		
		for(int[] i:table) {
			for(int j:i) {
				System.out.println("table["+d+"]"+"["+c+"]"+"="+j+"\t");
			c++;
			}
			
			c=0;
			d++;
			
		}
		
	}

}
