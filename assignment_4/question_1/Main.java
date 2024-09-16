package assignment_4.question_1;

//assignment_4.question_1
// 1) Write a program to manage list of students using ArrayList. Include methods add, remove, and display students. 

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManagement management = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Welcome to Student Management System");
			System.out.println("1) Add Student :");
			System.out.println("2) remove Student :");
			System.out.println("3) Show Students :");
			System.out.println("4) Exit :");
			System.out.print("Enter Your Choice :");
			choice = sc.nextInt();
				
			switch (choice) {
			case 1: {
					System.out.print("Enter Student Name :");
						String name = sc.next();
					System.out.print("Enter Student Id : ");

						int id = sc.nextInt();
					management.addStudent(name, id);
					break;
			}
			case 2: {
				System.out.print("Enter Student Id to remove :");
					int id = sc.nextInt();
				management.removeStudent(id);
				break;
		}	
			case 3: {
					management.showStudents();
				break;
		}	
			case 4: {
				System.out.print("Exiting....");
				break;
		}
			default:
				System.out.println("You Enter Invalid Choice... Please Try Again...");
			}
			
		}while(choice != 4);
	}
}
