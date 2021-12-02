package com.OOEmployee;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeManager eManager = new EmployeeManager();
		Scanner inputReader = new Scanner(System.in);
		String choice ;
		String cont = "Y";
		
		while(!cont.equals("n")) {
		
		 eManager.managementOptions();
		 choice = inputReader.nextLine();
		
		 if(Integer.parseInt(choice)==1) {
			 eManager.addEmployee();
		}
		 
		else if(Integer.parseInt(choice)==2) {
			eManager.updateEmployee();
			}
		 
		else if(Integer.parseInt(choice)==3) {
			eManager.deleteEmployee();
			}
		 
		//else break;
		 
		 System.out.println("\nPress any key to continue.\nPress 'n' to exit.");
		  cont = inputReader.nextLine();
		
		} 
		
		// Print all Employees Details
		eManager.getAllEmployees();
	
	}

}

