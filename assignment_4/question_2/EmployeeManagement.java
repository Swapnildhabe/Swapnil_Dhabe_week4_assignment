package assignment_4.question_2;

//assignment_4.question_2
//2) Create a program that uses HashMap to store and retrieve employee details based on their ID.

import java.util.HashMap;

public class EmployeeManagement {
	private HashMap<Integer, Employee> employeeMap;
	
	public EmployeeManagement() {
		employeeMap = new HashMap<Integer, Employee>();
	}
	
	public void addEmployee(int id, String name, String department) {
		 employeeMap.put(id, new Employee(id, name, department));
		System.out.println("Employee added Successfully...");
	}
	
	public void removeEmployee(int id) {
		if(employeeMap.remove(id)!= null){
			System.out.println("Employee Removed Successfully...");
		}else {
			System.out.println("Employee Not Found...");
		}
	}
	
	public void displayEmployee(int id) {
		Employee employee = employeeMap.get(id);
		if(employee != null) {
			System.out.println(employee);
		}else {
			System.out.println("Employee Not Found...");
		}
	}
	
	public void displayAllEmployee() {
		if(employeeMap.isEmpty()) {
			System.err.println("No Employee to Display");
		}else {
			for(Employee employee : employeeMap.values()){
				System.out.println(employee);
			}
			
		}
	}
}
