package service;
import model.Student;

import java.util.ArrayList;
import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

}
