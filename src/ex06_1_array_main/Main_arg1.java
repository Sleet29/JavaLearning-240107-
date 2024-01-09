package ex06_1_array_main;

public class Main_arg1 {

	public static void main(String[] args) {
		
		
		/* for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
			}
	
		 */
		for(String name : args) {
			System.out.println(name);
		}
	}
}
