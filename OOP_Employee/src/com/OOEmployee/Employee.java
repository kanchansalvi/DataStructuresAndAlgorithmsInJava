package com.OOEmployee;

public class Employee {
	
	String empName;
	int empid;
	private static int id = 1000;
	
public Employee() {
	
}
	
public Employee(String name) {
	if(isNameValid(name)) { 
		this.empName = name;
	    Employee.id = id+1;
	    empid=id;
	}
}
	
public String getEmpName() {
	return empName;
}

public void setEmpName(String name) {
	if(isNameValid(name)) {
		this.empName = name;
	}	
}

public int getId() {
	return empid;
}
 
 public Employee updateEmployee(int id, String updatedName) {
	 Employee upEmp = new Employee();
	 upEmp.empid = id;
	 if(isNameValid(updatedName)) upEmp.empName = updatedName;
	 return upEmp;
 }

 public static boolean isNameValid(String name) {
	 
	 if (!name.matches("[a-zA-Z]+")) {
		 System.out.println("Name is invalid.");
	 }
	 
	 return name.matches("[a-zA-Z]+");
 }

}

