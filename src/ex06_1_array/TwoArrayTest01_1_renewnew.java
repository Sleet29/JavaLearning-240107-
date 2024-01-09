package ex06_1_array;

public class TwoArrayTest01_1_renewnew {
	public static void main(String args[]) {
        String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
        String sub_name[] = { "국어", "수학", "영어" };

        int[][] score = {
                { 85, 60, 70 }, // 0행(1번학생)
                { 90, 95, 80 }, // 1행(2번학생)
                { 75, 80, 100 }, // 2행(3번학생)
                { 80, 70, 95 }, // 3행(4번학생)
                { 100, 65, 80 } // 4행(5번학생)
        };

        int[] subject = new int[3]; // 과목총점 저장
        int[] student = new int[5]; // 학생의 총점 저장

        System.out.println("===각 과목별 총점구하기===");

        for (int[] scores : score) {
            for (int j = 0; j < 3; j++) {
                subject[j] += scores[j];
            }
        }

        for (int j = 0; j < 3; j++)
            System.out.println(sub_name[j] + "의 총점 = " + subject[j]);

        System.out.println();

        System.out.println("===학생별 총점구하기===");

        for (int i = 0; i < 5; i++) {
            for (int j=0;j<3;j++) {
                student[i] += score[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "의 총점 = " + student[i]);
        }
    }
}