package e_oop.score;

public class Score {
	
	public static void main(String[] arg) {
		Student[] students = new Student[10];
		
		for(int i = 0; i < students.length; i++){
			Student student = new Student();
			
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			
			students[i] = student;
		}
		
		//성적처리 프로그램
		
	}

}
