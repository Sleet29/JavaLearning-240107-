package programmers;
import java.io.InputStream;
import java.util.Scanner;

public class Test01 {
		public static void main(String args[]) {
			InputStream is = System.in;
			Scanner sc = new Scanner(is);
			String name=sc.next();
			System.out.println(name+"??!");
			
			sc.close();
		}
}

