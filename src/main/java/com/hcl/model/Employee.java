package com.hcl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private int empid;
	private String empname;
	private String empdept;
	private double empsalary;

	public Employee() {
		super();
	}

	public Employee(int empid, String empname, String empdept, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empsalary = empsalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empsalary=" + empsalary
				+ "]";
	}
}