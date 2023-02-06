package ch16;

import java.util.Calendar;

public class SchoolTest {

	public static void main(String[] args) {

		School school1 = School.getInstance();
		
		School school2 = School.getInstance();
		
		System.out.println(school1 == school2);
		
		Calendar  calendar  = Calendar.getInstance();
	}

}
