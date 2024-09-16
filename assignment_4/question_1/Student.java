package assignment_4.question_1;

//assignment_4.question_1
//1) Write a program to manage list of students using ArrayList. Include methods add, remove, and display students. 

public class Student {
	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
