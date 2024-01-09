package javaHW;

public class HW10 {
	public static void main(String args[]) {
	int su1=10;
	int su2=20;
	int tmp;
	
	System.out.println("su1 = "+su1+"\t"+"su2 = "+su2);
	
	tmp=su1;
	su1=su2;
	su2=tmp;
	
	System.out.println("su1 = "+su1+"\t"+"su2 = "+su2);
	}
}
