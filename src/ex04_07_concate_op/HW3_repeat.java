package ex04_07_concate_op;
import java.io.InputStream;
import java.util.Scanner;

public class HW3_repeat {
    public static void main(String args[]) {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("limit를 입력하세요 : ");
            int limitNum = scanner.nextInt();

            System.out.print("listcount를 입력하세요 : ");
            int listcount = scanner.nextInt();

            System.out.print("maxpage = ");
            if ((listcount % limitNum) == 0) {
                System.out.print("총 페이지수는 ");
                System.out.print(listcount / limitNum);
                System.out.print(" 입니다.");
            } else {
                System.out.print("총 페이지수는 ");
                System.out.print(1 + (listcount / limitNum));
                System.out.print(" 입니다.");
            }

            System.out.println(); // Move to the next line for better formatting

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next();
            
            // Check the response to decide whether to continue or exit the loop
            if (response.equalsIgnoreCase("no")) {
                continueInput = false;
            }
        }

        scanner.close();
    }
}
