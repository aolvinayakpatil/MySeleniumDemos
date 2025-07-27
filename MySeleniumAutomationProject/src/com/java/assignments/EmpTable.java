package com.java.assignments;

public class EmpTable {
	int id;
	String empId;
	String empName;
	float empSalary;
	float LastYearPackage;
	float CurrentYearPackage;
	float NextYearPackage;
	float ProvidentFund;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public float getLastYearPackage() {
		return LastYearPackage;
	}
	public void setLastYearPackage(float lastYearPackage) {
		LastYearPackage = lastYearPackage;
	}
	public float getCurrentYearPackage() {
		return CurrentYearPackage;
	}
	public void setCurrentYearPackage(float currentYearPackage) {
		CurrentYearPackage = currentYearPackage;
	}
	public float getNextYearPackage() {
		return NextYearPackage;
	}
	public void setNextYearPackage(float nextYearPackage) {
		NextYearPackage = nextYearPackage;
	}
	public float getProvidentFund() {
		return ProvidentFund;
	}
	public void setProvidentFund(float providentFund) {
		ProvidentFund = providentFund;
	}
	public void save1() {
		System.out.printf("%-8s %-10s %-10.1f %-10.1f %-10.1f %-10.1f %-10.1f%n",
                empId, empName, empSalary, LastYearPackage, CurrentYearPackage, NextYearPackage, ProvidentFund);
	}
	@Override
	public String toString() {
		return "EmpTable [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", LastYearPackage=" + LastYearPackage + ", CurrentYearPackage=" + CurrentYearPackage
				+ ", NextYearPackage=" + NextYearPackage + ", ProvidentFund=" + ProvidentFund + "]";
	}
	public void save() {
		System.out.println(this);
	}
	
}
