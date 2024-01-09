package ex05_3_while;
public class While_calander {
	public static void main(String args[]) {
        int cnt = 1;
        
        while (cnt <= 31) {
            System.out.print(cnt++ + "\t");
            if (cnt % 7 == 1) {
                System.out.println(); // Move to the next line after every 7 days
            }
        }
    }
}