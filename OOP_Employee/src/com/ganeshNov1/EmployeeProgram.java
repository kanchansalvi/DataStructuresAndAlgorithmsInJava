package com.ganeshNov1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails emp1 = new EmployeeDetails();
		HashMap<Integer,EmployeeDetails> empMap=new HashMap<>();
		
		Scanner inputReader = new Scanner(System.in);
		String name ;
		String cont = "Y";
		
		while(!cont.equals("n")) {
		System.out.println("Select what you want to do:\n  press 1 to Add Employee \n"
				+ "  press 2 to Update Employee Name:  \n  press 3 to Delete Employee");
		
		 name = inputReader.nextLine();
		
		 if(Integer.parseInt(name)==1) {
			System.out.print("Enter Employee Name:");
			 name = inputReader.nextLine();
			emp1 = new EmployeeDetails(name);
			System.out.println(emp1.getEmpName()+"  id = "+ emp1.getId());
			empMap.put(emp1.getId(),emp1);
		}
		 
		else if(Integer.parseInt(name)==2) {
			System.out.print("Enter Employee id of Employee to be updated");
			int eid = Integer.parseInt(inputReader.nextLine());
				if(empMap.containsKey(eid)) {
					System.out.print("Enter Employee's updated name: ");
					name = inputReader.nextLine();
					empMap.replace(eid, emp1.updateEmployee(eid, name));
				}
				else {
					System.out.println("Employee with id "+eid+" do not exist");
				}
			}
		 
		else if(Integer.parseInt(name)==3) {
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
		 
		//else break;
		 
		 System.out.println("\nPress any key to continue.\nPress 'n' to exit.");
		  cont = inputReader.nextLine();
		
		} 
		
		// Print all Employees Details
		for(EmployeeDetails emp : empMap.values())  
			        System.out.println("ID="+emp.empid+" Name="+emp.empName);  
	  
	
	}

}

