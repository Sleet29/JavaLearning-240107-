/*package ex07_test_01;

import javaHW.Student;

public class Student_main1_method {
	public static void main(String args[]) {
		Student[] students = {
	            new Student("강호동", 85, 60, 70),
	            new Student("이승기", 90, 95, 80),
	            new Student("유재석", 75, 80, 100),
	            new Student("하하", 80, 70, 95),
	            new Student("이광수", 100, 65, 80)
	        };
		
		int subject[] = getTotal(students);
		print(students,subject);
	}
	
	private static int[] getTotal(Student[] objs) {
		int[] subject = new int[3];
		for(Student obj: objs) {
			subject[0] += obj.kor;
			subject[1] += obj.eng;
			subject[2] += obj.math;
		}
		return subject;
	}

	static void print(Student []objs, int[] subject) {
		
		System.out.println("====================학생별총점==========================");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        
        for (Student obj:objs) {
        	printInfo(obj);
        }
        
        for (int j = 0; j<45;j++) {
        	System.out.print("=");
        }
        
        System.out.println("\n총점\t");
        for (int i = 0; i<subject.length;i++)
        	System.out.print(subject[i]+"\t");
        
		
	}
	
	static void printInfo(Student student) {
        System.out.println(student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t"
                + student.getMath() + "\t" + student.getTotal() + "\t"
                + String.format("%.1f", student.getAverage()));
    }
	
	// main
}

*/

package javaHW2;

public class Student_main1_method {
	public class Main {
	    public static void main(String[] args) {
	        // 학생 배열 생성
	        Student[] students = {
	            new Student("강호동", 85, 60, 70),
	            new Student("이승기", 90, 95, 80),
	            new Student("유재석", 75, 80, 100),
	            new Student("하하", 80, 70, 95),
	            new Student("이광수", 100, 65, 80)
	        };

	        for (Student student : students) {
	            System.out.println(student.name + "의 총합: " + student.getTotal());
	            System.out.println(student.name + "의 평균: " + student.getAverage());
	            System.out.println(); // 개행
	        }

	        System.out.println("국어 총합: " + Student.getKorTotal());
	        System.out.println("영어 총합: " + Student.getEngTotal());
	        System.out.println("수학 총합: " + Student.getMathTotal());
	    }
}

	/*
	public static void main(String args[]) {
        Student[] students = { 
            new Student("강호동", 85, 60, 70),
            new Student("이승기", 90, 95, 80),
            new Student("유재석", 75, 80, 100),
            new Student("하하", 80, 70, 95),
            new Student("이광수", 100, 65, 80)
        
            printStudent(students);
        };
        
        
    }
	

    

    
    static void print(Student[] objs, int[] subject) {
        System.out.println("====================학생별총점==========================");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

        for (Student obj : objs) {
           printInfo(obj);
        }

        for (int j = 0; j < 50; j++) {
            System.out.print("=");
        }

        System.out.print("\n총점\t");
        for (int i = 0; i < subject.length; i++)
            System.out.print(subject[i] + "\t");
    }

    
    static void sort(Student[] students) {
    	for (int i = 0; i < students.length - 1 ; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getTotal() < students[j + 1].getTotal()) {
                    // 원소 교체
                    Student temp = students[j];
                    //Student 형
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    
    static void printStudent
    
    
    /*
    static void printInfo(Student student) {
        System.out.println(student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t"
                + student.getMath() + "\t" + student.getTotal() + "\t"
                + String.format("%.1f", student.getAverage()));
    }
    */
}
/*
 * 
 * 
 */


	
/*public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("강호동", 85, 60, 70),
            new Student("이승기", 90, 95, 80),
            new Student("유재석", 75, 80, 100),
            new Student("하하", 80, 70, 95),
            new Student("이광수", 100, 65, 80)
        };

        int[] totals = {0, 0, 0};

        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

        for (Student student : students) {
            int total = student.getTotal();
            double average = student.getAverage();
            System.out.println(
                student.getName() + "\t" +
                student.getKorean() + "\t" +
                student.getEnglish() + "\t" +
                student.getMath() + "\t" +
                total + "\t" +
                Math.round(average * 10) / 10.0
            );

            totals[0] += student.getKorean();
            totals[1] += student.getEnglish();
            totals[2] += student.getMath();
        }

        System.out.println("과목별 총점:\t" + totals[0] + "\t" + totals[1] + "\t" + 


/*
	private static int[] getTotal(Student h1, Student h2, Student h3, Student h4,
								  Student h5) {
		int[] subject = new int[3];
		subject[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
		subject[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
		subject[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
		return subject;
	}
	
	static void print(students[], int[] subject) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		printInfo([0]);
	}
	
	static void printInfo(Student[] student) {
		System.out.println(Student.name+"\t"+student.kor+"\t"+student.eng+"\t"+student.math+"\t"
	+student.getTotal()+"\t"+
				// 소수점 출력 두가지
				// 1.Math.round()		무조건 소수 첫 번째 자리 반올림	
				// 2.String.format()	출력 형식 지정
				//Math.round(student.getAverage()*10)/10.0
				String.format("%.1f",student.getAverage())
				);
	}
}
*/