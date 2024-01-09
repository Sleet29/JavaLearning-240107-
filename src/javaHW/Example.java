package javaHW;
import java.io.*;

public class Example {
	public static void main(String[] args) throws IOException {
        // 파일 경로 지정
        String filePath = "example.txt";

        // BufferedReader를 사용하여 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // 파일에서 데이터를 읽는 작업 수행
            String line;
            while ((line = br.readLine()) != null) {
                // 읽은 데이터 처리
                System.out.println(line);
            }
        } catch (IOException e) {
            // IOException 처리
            e.printStackTrace();
        }
    }
}
