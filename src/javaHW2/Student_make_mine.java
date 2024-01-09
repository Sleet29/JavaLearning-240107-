package javaHW2;
public class Student_make_mine {
	public static void main(String args[]) {
		Student[] students = {
            new Student("강호동", 85, 60, 70),
            new Student("이승기", 90, 95, 80),
            new Student("유재석", 75, 80, 100),
            new Student("하하", 80, 70, 95),
            new Student("이광수", 100, 65, 80)
        };

		
		
        int[] totals = {0, 0, 0};

        System.out.println("====================학생별총점==========================");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

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

            totals[0] += student.kor;
            totals[1] += student.eng;
            totals[2] += student.math;
        }

        System.out.println("====================================================");
        System.out.println("총점\t" + totals[0] + "\t" + totals[1] + "\t" + totals[2]);
    }
}

/*
public class Main {
public static void main(String[] args) {
    // 학생 객체 생성
    Student student1 = new Student("John", 90, 85, 95);

    // 다른 학생 객체 생성
    Student student2 = new Student("Jane", 80, 75, 85);

    // 총합 및 평균 출력
    System.out.println(student1.name + "의 총합: " + student1.getTotal());
    System.out.println(student1.name + "의 평균: " + student1.getAverage());

    System.out.println(student2.name + "의 총합: " + student2.getTotal());
    System.out.println(student2.name + "의 평균: " + student2.getAverage());

    // 국어, 영어, 수학 총합 출력
    System.out.println("국어 총합: " + Student.getKorTotal());
    System.out.println("영어 총합: " + Student.getEngTotal());
    System.out.println("수학 총합: " + Student.getMathTotal());
}
}

*/