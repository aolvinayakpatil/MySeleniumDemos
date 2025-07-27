package com.java.assignments;

public class EmpUtility {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sneha","S001",10000.0f);
		Employee e2 = new Employee("Snehal","S002",12000.0f);
		Employee e3 = new Employee("Suneha","S003",15000.0f);
		EmpTable t1 = new EmpTable();
		
		System.out.printf("%-8s %-10s %-10s %-10s %-10s %-10s %-10s%n",
				"Emp.ID", "Emp.Name", "Salary", "LYS", "CYS", "NYS", "PF");
		System.out.println("------------------------------------------------------------------------");

		
		t1.setEmpId(e1.getEmpID());
		t1.setEmpName(e1.getEmpName());
		t1.setEmpSalary(e1.getEmpSalary());
		float LYPe1 = e1.LastYrPkg();
		t1.setLastYearPackage(LYPe1);
		float CYPe1=e1.CurrentYrPkg();
		t1.setCurrentYearPackage(CYPe1);
		float NYPe1=e1.NextYrPkg();
		t1.setNextYearPackage(NYPe1);
		float PFe1=e1.ProvidentFund();
		t1.setProvidentFund(PFe1);
		t1.save();
		
		EmpTable t2 = new EmpTable();
		t2.setEmpId(e2.getEmpID());
		t2.setEmpName(e2.getEmpName());
		t2.setEmpSalary(e2.getEmpSalary());
		float LYPe2 = e2.LastYrPkg();
		t2.setLastYearPackage(LYPe2);
		float CYPe2=e2.CurrentYrPkg();
		t2.setCurrentYearPackage(CYPe2);
		float NYPe2=e2.NextYrPkg();
		t2.setNextYearPackage(NYPe2);
		float PFe2=e2.ProvidentFund();
		t2.setProvidentFund(PFe2);
		t2.save();
		
		EmpTable t3 = new EmpTable();
		t3.setEmpId(e3.getEmpID());
		t3.setEmpName(e3.getEmpName());
		t3.setEmpSalary(e3.getEmpSalary());
		float LYPe3 = e3.LastYrPkg();
		t3.setLastYearPackage(LYPe3);
		float CYPe3=e3.CurrentYrPkg();
		t3.setCurrentYearPackage(CYPe3);
		float NYPe3=e3.NextYrPkg();
		t3.setNextYearPackage(NYPe3);
		float PFe3=e3.ProvidentFund();
		t3.setProvidentFund(PFe3);
		t3.save();

	}

}
