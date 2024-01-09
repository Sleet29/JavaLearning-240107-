package javaHW;
public class Student_make {
	public static void main(String args[]) {
		Student obj1 = new Student("강호동",85,60,70);
		Student obj2 = new Student("이승기",90,95,80);
		Student obj3 = new Student("유재석",75,80,100);
		Student obj4 = new Student("하하",80,70,95);
		Student obj5 = new Student("이광수",100,65,80);
		
		
		int tot1 = obj1.kor + obj2.kor+ obj3.kor + obj4.kor+obj5.kor;
		int tot2 = obj1.eng + obj2.eng+ obj3.eng + obj4.eng+obj5.eng;
		int tot3 = obj1.math + obj2.math+ obj3.math + obj4.math+obj5.math;
		
		
		System.out.println("====================학생별총점==========================");
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t");
		
		System.out.println(obj1.name+"\t"+obj1.kor+"\t"+obj1.eng+"\t"+obj1.math+"\t"+obj1.getTotal()+"\t"+obj1.getAverage());
		System.out.println(obj2.name+"\t"+obj2.kor+"\t"+obj2.eng+"\t"+obj2.math+"\t"+obj2.getTotal()+"\t"+obj2.getAverage());
		System.out.println(obj3.name+"\t"+obj3.kor+"\t"+obj3.eng+"\t"+obj3.math+"\t"+obj3.getTotal()+"\t"+obj3.getAverage());
		System.out.println(obj4.name+"\t"+obj4.kor+"\t"+obj4.eng+"\t"+obj4.math+"\t"+obj4.getTotal()+"\t"+obj4.getAverage());
		System.out.println(obj5.name+"\t"+obj5.kor+"\t"+obj5.eng+"\t"+obj5.math+"\t"+obj5.getTotal()+"\t"+obj5.getAverage());
		System.out.println("====================================================");
		System.out.println("총점"+"\t"+tot1+"\t"+tot2+"\t"+tot3);
	}
	
}


	
	

