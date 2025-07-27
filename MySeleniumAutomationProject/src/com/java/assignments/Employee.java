package com.java.assignments;

public class Employee {
	String empName;
	String empID;
	float empSalary;
	
	public Employee(String eName, String eId, float eSalary) {
		empName=eName;
		empID=eId;
		empSalary = eSalary;
	}
	public float LastYrPkg() {
		float currentYrSal=empSalary*12;
		float lastYrSal=currentYrSal-(currentYrSal*10/100);
		return lastYrSal;
	}
	public float CurrentYrPkg() {
		float currentYrSal=empSalary*12;
		return currentYrSal;
	}
	public float NextYrPkg() {
		float currentYrSal=empSalary*12;
		float nextYrSal=currentYrSal+(currentYrSal*10/100);
		return nextYrSal;
	}
	public float ProvidentFund() {
		float currentYrSal=empSalary*12;
		float providentFund=(currentYrSal*12/100);
		return providentFund;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
}
