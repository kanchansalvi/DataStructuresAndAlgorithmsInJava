package com.OOEmployee;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {

//	Employee emp = new Employee();
	private HashMap<Integer,Employee> empMap=new HashMap<>();
	Scanner inputReader = new Scanner(System.in);
	
public void addEmployee() {
	
	System.out.print("Enter Employee Name:");
	String name = inputReader.nextLine();
	
	Employee emp = new Employee(name);
	
	System.out.println(emp.getEmpName()+"  id = "+ emp.getId());
	empMap.put(emp.getId(),emp);	
}

public void updateEmployee() {
	System.out.print("Enter Employee id of Employee to be updated");
	int eid = Integer.parseInt(inputReader.nextLine());
	
		if(empMap.containsKey(eid)) {
			System.out.print("Enter Employee's updated name: ");
			String name = inputReader.nextLine();
				if(Employee.isNameValid(name)) {
//					empMap.replace(eid, emp.updateEmployee(eid, name));
					empMap.get(eid).setEmpName(name); // ganesh written
				}
				else 
					System.out.println("Name is invalid");
		}
		else {
			System.out.println("Employee with id "+eid+" do not exist");
		}
	
}
	
public void deleteEmployee() {
	
	System.out.print("Enter Employee id of Employee to be deleted");
	int eid = Integer.parseInt(inputReader.nextLine());
		if(empMap.containsKey(eid)) {
			empMap.remove(eid);
			System.out.print("Employee deleted");
		}
		else {
			System.out.println("Employee with id "+eid+" do not exist");
		}
	
}

public void getAllEmployees() {
	for(Employee emp : empMap.values())  
        System.out.println("ID="+emp.empid+" Name="+emp.empName);
}

public void managementOptions() {
	System.out.println("Select what you want to do:\n  press 1 to Add Employee \n"
			+ "  press 2 to Update Employee Name:  \n  press 3 to Delete Employee");
}
}
