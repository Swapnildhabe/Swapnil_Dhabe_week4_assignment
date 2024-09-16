package assignment_4.question_1;

//assignment_4.question_1
//1) Write a program to manage list of students using ArrayList. Include methods add, remove, and display students. 

import java.util.ArrayList;

public class StudentManagement {
	private ArrayList<Student> students;
	
	public StudentManagement() {
		students = new ArrayList<Student>();
	}
	
	public void addStudent(String name, int id) {
		students.add(new Student(name, id));
		System.out.println("Student added Successfully...");
	}
	
	public void removeStudent(int id){
		for(Student student : students) {
			if(student.getId() == id) {
				students.remove(id);
				System.out.println("Student remove Successfully...");
			}else {
				System.out.println("Student Not Fournd... ");
			}
		}
	}
	
	public void showStudents() {
		int count=0;
		if(students.isEmpty()) {
			System.out.println("No students list to show...");
		}else {
			for(Student  student : students) {
				count+=1; 
					System.out.println("count) "+student);
		}
			
		}
	}
}
