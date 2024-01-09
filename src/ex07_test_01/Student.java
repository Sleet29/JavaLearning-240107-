package ex07_test_01;
public class Student {
    String name;
    int kor, eng, math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getKor() {
        return kor;
    }

    int getEng() {
        return eng;
    }

    int getMath() {
        return math;
    }

    String getName() {
        return name;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return getTotal() / 3f;
    }
}


/*public class Student {
	String name;
	int kor,eng,math;
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
		
	}
	
	String getName() {
		return name;
		
	}
	
	float getAverage() {
		return (getTotal() / 3f);
	}
	

}
*/