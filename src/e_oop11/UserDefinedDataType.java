package e_oop11;


public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 *  사용자 정의 데이터 타입
		 *  - 데이터의 최종 진화 형태이다.(기본형 ->배열->클래스)
		 *  - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 *  - 변수와 메서드로 구성할 수 있다.
		 */
		
		//기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		//클래스
		Student student; //변수 선언
		student = new Student(); //초기화(객체생성/인스턴스화)
		
		student.kor = 80;
		student.eng = 90;
		student.math = 70;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동";
		
		System.out.println(student.name + " / " + student.sum + " / " +student.avg);
		
		student = new Student();
		
		student.kor = 90;
		student.eng = 100;
		student.math = 80;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "정원모";
		
		System.out.println(student.name + " / " + student.sum + " / " +student.avg);
		
		Student s2 = new Student();
		
		s2.kor = (int)(Math.random() * 101);
		s2.eng = (int)(Math.random() * 101);
		s2.math = (int)(Math.random() * 101);
		
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = s2.sum / 3.0;
		s2.name = "정원모";
		
		System.out.println(s2.name + " / " +s2.sum + " / " + s2.avg);
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	
}

