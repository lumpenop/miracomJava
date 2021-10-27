package com.edu.vo;

public class Manager extends Employee{
	
	private String dept;
	private int deptno;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, MyDate birthDate, double salary, String dept, int deptno) {
		super(name, birthDate, salary);
		// TODO Auto-generated constructor stub
		
		this.dept = dept;
		this.deptno = deptno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + dept + ", " + deptno;
	}
	
	
}
