package com.home.collection.map.hashmap;

public class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return empId + empName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (!(this instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee) obj;
		return this.getEmpId() == emp.getEmpId() && this.getEmpName().equals(emp.getEmpName());
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Manash");
		Employee emp2 = new Employee(101, "Manash");
		Employee emp3 = new Employee(103, "Ranjan");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
	}

}
