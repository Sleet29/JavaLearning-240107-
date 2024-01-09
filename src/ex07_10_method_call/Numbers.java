package ex07_10_method_call;

public class Numbers {
	private int[] num;
	
	Numbers(int num[]){
		this.num = num;
	}
	
	int getTotal() {
		int sum=0;
		/*
		for(int i=0;i< num.length;i++) {
			sum+=num[i];
		}*/
		for(int n : num){
			sum +=n;
		}
		 
		
		return sum;
	}
	
	int getAverage() {
		return getTotal() /  3;
	}

}
