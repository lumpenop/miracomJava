package com.edu.service;

import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeService {
	
	public int midx = 0;
	public int egidx = 0;
	public Manager[] managers = new Manager[10];
	public Engineer[] engineers = new Engineer[10];
	public int[] binMidx = new int[10];
	public int[] binEgidx = new int[10];

	
	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public void addManager(Manager m){
		if(midx == 10){
			System.out.println(midx);
			System.out.println("ȸ�� ���� �Ұ�");
		}

		
		for(int i=0; i < binMidx.length; i++) {
			
			if(binMidx[i]==0) {
				managers[i] = m;
				binMidx[i] = 1;
				midx++;
				System.out.println("ȸ�� ��ȣ��" + i + "�� �Դϴ�");
				break;
			}
		}
		
		
	}
	
	public void addEngineer(Engineer ng){
		if(binEgidx[0] == 0) engineers[egidx++] = ng;
		else {
			engineers[binEgidx[0]-1] = ng;
		}
		
	}
	
	public void deleteManager(int delMidx) {
		
		if(binMidx[delMidx] == 1) {
			managers[delMidx] = null;
			binMidx[delMidx] = 0;
			midx--;
			System.out.println(delMidx + "�� Manager ���� �Ϸ�.");
		}else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		}
		
	}
	
	public void deleteEngineerr(int egidx) {
		managers[egidx] = null;
		binEgidx[binEgidx.length] = egidx+1;
	}
	
	public void updateManager(int idx, double salary, String dept, int deptno) {
		managers[idx].setSalary(salary);
		managers[idx].setDept(dept);
		managers[idx].setDeptno(deptno);
		
	}
	
	public Manager findManager(String name) {
		
		Manager manager = null;
		for(Manager m : managers) {
			if(m.getName() == name) {
				manager = m;
			}
		}
		
			
		return manager;
	}
	
	public Manager[] findManager(int deptno) {
		Manager[] returnManagers= new Manager[managers.length];
		
		int index = 0;
		for(Manager m : managers) {
			if(m.getDeptno() == deptno) {
				returnManagers[index++] = m;
			}
		}
		
		return returnManagers;
	}
	
	public void printManager() {
		for(Manager m : managers) {
			System.out.println(m);
		}
	}
	
}
