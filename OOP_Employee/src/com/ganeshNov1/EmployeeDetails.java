package com.ganeshNov1;

public class EmployeeDetails {
	
	String empName;
	int empid;
	private static int id = 1000;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String employee) {
		this.empName = employee;
		
	}

	public int getId() {
		return empid;
	}
	
 public EmployeeDetails(String name) {
		this.empName = name;
		this.id = id+1;
		empid=id;
	}
 public EmployeeDetails() {}
 
 public EmployeeDetails updateEmployee(int id, String updatedName) {
	 EmployeeDetails upEmp = new EmployeeDetails();
	 upEmp.empid = id;
	 upEmp.empName = updatedName;
	  
	 return upEmp;
 }


}

