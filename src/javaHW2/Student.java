/*package javaHW2;
public class Student {
	String name;
	int kor,eng,math;
	
	static int korTotal,mathTotal,engTotal;
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal=korTotal+kor;
		engTotal=engTotal+eng;
		mathTotal=mathTotal+math;
	}
	
	int getTotal() {
		return kor+eng+math;
		
	}
	
	float getAverage() {
		return (getTotal() / 3f);
	}
	

}
*/

package javaHW2;
public class Student {
    // 필드
    // 인스턴스 필드
    String name;
    int kor, eng, math;

    // static 필드
    static int korTotal, engTotal, mathTotal;

    // 생성자
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        // 과목별 총합 계산
        korTotal += kor;
        engTotal += eng;
        mathTotal += math;
    }

    // 메서드
    // 총합을 반환하는 메서드
    int getTotal() {
        return kor + eng + math;
    }

    // 평균을 반환하는 메서드
    float getAverage() {
        return (float) getTotal() / 3f;
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
    

    // static 메서드
    public static int getKorTotal() {
        return korTotal;
    }

    public static int getEngTotal() {
        return engTotal;
    }

    public static int getMathTotal() {
        return mathTotal;
    }
    
    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}

