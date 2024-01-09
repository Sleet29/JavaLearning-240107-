package javaHW;

public class HW12_exextended {
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
        

        for(int i=0;i<=4;i++) {
        	for(int j=0;j<=2;j++) {
        	student[i]+=score[i][j];
        	}
        }

        for(int i=0;i<3;i++) {
        	for(int j=0;j<5;j++) {
        		subject[i]+=score[j][i];
        	}
        }
        
        for(int i=0;i<=4;i++) {
        	avg[i]=student[i]/3;
        }
        
        System.out.println("============== 학생별  /  과목별 총점구하기 ==============");
        
        System.out.print("\t");
        for(int i=0;i<3;i++) {
        	System.out.print(sub_name[i]+"\t");
        }
        System.out.println("총점"+"\t"+"평균");
        
        	for(int j=0;j<=4;j++) {
        		System.out.print(name[j]+"\t");
        	
        		for(int i=0;i<=2;i++) {
        			System.out.print(score[j][i]+"\t");
        		}
        		System.out.print(student[j]+"\t"+avg[j]);
        		System.out.println();
        	}
        
        System.out.println("====================================================");
        
        
        System.out.print("총점"+"\t");
        for(int i=0;i<3;i++) {
        	System.out.print(subject[i]+"\t");
        }
        
	}

}
