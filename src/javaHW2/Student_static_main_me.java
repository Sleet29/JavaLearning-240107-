package javaHW2;
public class Student_static_main_me {
	public static void main(String args[]) {
        Student[] students = {
            new Student("강호동", 85, 60, 70),
            new Student("이승기", 90, 95, 80),
            new Student("유재석", 75, 80, 100),
            new Student("하하", 80, 70, 95),
            new Student("이광수", 100, 65, 80)
        };

        Student.sort(students);
        printStudent(students);
	}

    static void printStudent(Student[] objs) {
        System.out.println("====================학생별총점==========================");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        for (Student obj : objs) {
            printInfo(obj);
        }
        for (int j = 0; j < 45; j++) {
            System.out.print("=");
        }
        System.out.print("\n총점\t");
        System.out.println(Student.korTotal + "\t"
                + Student.engTotal + "\t"
                + Student.mathTotal);
    }
    
    static void printInfo(Student student) {
        System.out.println(student.getName() + "\t" +
                student.getKor() + "\t" +
                student.getEng() + "\t" +
                student.getMath() + "\t" +
                student.getTotal() + "\t" +
                String.format("%.1f", student.getAverage()));
    }
    
	
	
	/*public static void main(String args[]) {
		Student[] students = {
            new Student("강호동", 85, 60, 70),
            new Student("이승기", 90, 95, 80),
            new Student("유재석", 75, 80, 100),
            new Student("하하", 80, 70, 95),
            new Student("이광수", 100, 65, 80)
		
		
            Student.sort(students);
            printStudent(students);
		}
		
		static void printStudent(Student[] objs) {
			System.out.print("====================학생별총점==========================");
			System.out.print("이름\t국어\t영어\t수학\t총점\t평균");
			for (Student obj : ojbs) {
				printInfo(obj);
			}
			for(int j=0;j<45;j++) {
				System.out.println("=");
			}
			System.out.print("\n총점\t");
			System.out.println(Student.korTotal+"\t"
							  +Student.engTotal+"\t"
							  +Student.mathTotal);
		
		}
		
		
			
		
       
        for (Student student : students) {
            int total = student.getTotal();
            System.out.println(
                student.name + "\t" +
                student.kor + "\t" +
                student.eng + "\t" +
                student.math + "\t" +
                total + "\t" +
                Math.round(student.getAverage()*10)/10.0
            );

            /*
            totals[1] += student.eng;
            totals[2] += student.math;
            */


      //  System.out.println("총점\t" + totals[0] + "\t" + totals[1] + "\t" + totals[2]);

}

