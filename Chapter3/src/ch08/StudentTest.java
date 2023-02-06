package ch08;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(101, "Kim");
		
		
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		studentKim.setKoreanSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
	
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
		System.out.println(studentLee.getStudentId());
		studentKim.showStudentScore();
	}

}
