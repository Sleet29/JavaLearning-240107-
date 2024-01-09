package javaHW;

public class HW12 {
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
        int[] avg = new int[5];
        
        
        
        
        System.out.println();
        
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
        
        for(int i=0;i<5;i++) {
        	avg[i] = student[i]/3;
        }
        
        
        System.out.println("=============== 학생별  /  과목별 총점구하기 ===============");
        System.out.print("       ");
        System.out.printf("\t%s  %s   %s   %s   %s",sub_name[0],sub_name[1],sub_name[2],"총점","평균");
        System.out.println();
        System.out.printf("%s\t%-6d%-6d%-6d%-6d%-6d",name[0],score[0][0],score[0][1],score[0][2],student[0],avg[0]);
        System.out.println();
        System.out.printf("%s\t%-6d%-6d%-6d%-6d%-6d",name[1],score[1][0],score[1][1],score[1][2],student[1],avg[1]);
        System.out.println();
        System.out.printf("%s\t%-6d%-6d%-6d%-6d%-6d",name[2],score[2][0],score[2][1],score[2][2],student[2],avg[2]);
        System.out.println();
        System.out.printf("%s\t%-6d%-6d%-6d%-6d%-6d",name[3],score[3][0],score[3][1],score[3][2],student[3],avg[3]);
        System.out.println();
        System.out.printf("%s\t%-6d%-6d%-6d%-6d%-6d",name[4],score[4][0],score[4][1],score[4][2],student[4],avg[4]);
        System.out.println();
        System.out.println("======================================================");
        
        System.out.print("총점"+"\t");
        System.out.printf("%-4d%-5d%-6d",subject[0],subject[1],subject[2]);
       
        
	}

}
