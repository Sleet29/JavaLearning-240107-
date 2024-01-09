package ex07_test_01;

public class Student_main1_method_array {
	public static void main(String args[]) {
		
		Student h1 = new Student("강호동", 85,60,70);
		Student h2 = new Student("이승기", 90,95,80);
		Student h3 = new Student("유재석", 75,80,100);
		Student h4 = new Student("하하", 80,70,95);
		Student h5 = new Student("이광수", 100,65,80);
		
		
		int subject[] = getTotal(h1,h2,h3,h4,h5);
		print(h1,h2,h3,h4,h5,subject);
		
	}

	private static int[] getTotal(Student h1, Student h2, Student h3, Student h4,
								  Student h5) {
		int[] subject = new int[3];
		subject[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
		subject[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
		subject[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
		return subject;
	}
	
	static void print(Student h1, Student h2, Student h3, Student h4,
			  Student h5, int[] subject) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		printInfo(h1);
		printInfo(h2);
		printInfo(h3);
		printInfo(h4);
		printInfo(h5);
	}
	
	static void printInfo(Student student) {
		System.out.println(student.name+"\t"+student.kor+"\t"+student.eng+"\t"+student.math+"\t"
	+student.getTotal()+"\t"+
				// 소수점 출력 두가지
				// 1.Math.round()		무조건 소수 첫 번째 자리 반올림	
				// 2.String.format()	출력 형식 지정
				//Math.round(student.getAverage()*10)/10.0
				String.format("%.1f",student.getAverage())
				);
	}
}
