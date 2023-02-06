package ch04;

public class Student {

	int studentId;
	String studentName;
	String studentAddress;
	
	public Student() {}
	
	public Student(int id, String name) {
		
		studentId = id;
		studentName = name;
	} 
	
	public Student(int id, String name, String studentAddress) {
		
		studentId = id;
		studentName = name;
		this.studentAddress = studentAddress;
	}
	

	public void showStudentInfo() {
		System.out.println(studentId + "," + studentName + "," + studentAddress);
		
		//System.out.println()
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
