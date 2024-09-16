package assignment_4.question_2;

//assignment_4.question_2
//2) Create a program that uses HashMap to store and retrieve employee details based on their ID.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EmployeeManagement management = new EmployeeManagement();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Employee Management System ");
			System.out.println("1) Add Employee : ");
			System.out.println("2) Remove Employee : ");
			System.out.println("3) Display Employee by Id : ");
			System.out.println("4) Display All Employee : ");
			System.out.println("5) Exit ");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
					System.out.print("Enter Employee Id : ");
					int id = sc.nextInt();
					System.out.print("Enter Employee Name : ");
					String name = sc.next();
					System.out.print("Enter Employee Department : ");
					String department = sc.next();
					management.addEmployee(id, name, department);
					break;
			}
			case 2: {
				System.out.print("Enter Employee Id to Remove : ");
				int removeId = sc.nextInt();
				management.removeEmployee(removeId);
				break;
		}
			case 3: {
				System.out.print("Enter Employee Id to Display : ");
				int displayId = sc.nextInt();
				management.displayEmployee(displayId);
				break;
		}
			  case 4:
                  management.displayAllEmployee();
                  break;
			default:
				System.err.println("invalid choice Please Try Again...");
			}
			
		}while(choice != 5);
	}
}
