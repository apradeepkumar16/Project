package com.sensiple.hashmap;

import java.io.Serializable;

public class Model implements Serializable
{
int EmpId;
String EmpName;
String Dept;
int Salary;
String Gender;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	this.EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	this.EmpName = empName;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	this.Dept = dept;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	this.Salary = salary;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	this.Gender = gender;
}
public Model(int empId, String empName, String dept, int salary, String gender) {

	this.EmpId = empId;
	this.EmpName = empName;
	this.Dept = dept;
	this.Salary = salary;
	this.Gender = gender;
}
@Override
public String toString() {
	return "Model [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Dept=" + Dept + ", Salary=" + Salary + ", Gender="
			+ Gender + "]";
}

	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
