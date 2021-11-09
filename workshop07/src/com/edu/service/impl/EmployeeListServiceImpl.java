package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;


/*
 * VO Class���� �ڵ鸵 �ϴ� ��ɸ� ��Ƴ��� ���� Ŭ����
 * ���� interface�� ��� �޾Ƽ� �ۼ���
 * 
 * �̷��� ���� Ŭ������ Ŭ���̾�Ʈ���� ���� ��û�� ��������
 * Ŭ���� �ν��Ͻ��� �� �ϳ� ������ ����� �ΰ�
 * ��û�� ó���ϴ� ���� ���� Ŭ���� ������ �޼ҵ尡 �޾Ƽ� ó��
 * -> Singletone Pattern
 * 
 * ���� JDBC���� Database ���ø����̼ǿ��� ���
 * 
 * ��Ŭ�� ����
 * 1. private static ��ü ����
 * 2. private���� ������ ����
 * 3. public static �޼ҵ�� ������ private ��ü�� return�ϴ� �޼ҵ� ����
 */
public class EmployeeListServiceImpl implements EmployeeListService{
	
	// �߰�
	private ArrayList<Employee> list;

	
	// �̱��� �߰�
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	
	private EmployeeListServiceImpl() {
		System.out.println("EmployeeListServiceImpl Creating...");
	}
	
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) {		
		list.add(e);
		//	
	}
	@Override
	public void deleteEmployee(String empId) {		
		//
		for(Employee e : list) {
			if(e.getEmpId() == empId) {
				list.remove(e);
				break;
			}
		}
		
	}
	@Override
	public void updateEmployee(Employee e) {		
		boolean find = false;
		//
		int index = 0;
		for(Employee em : list) {
			
			if(em.getEmpId() == e.getEmpId()) {
				list.set(index, e);
				break;
			}
			index++;
		}
		
		
		
		 
	}//updateEmployee
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		//
		for(Employee e : list) {
			if(e.getAddr() == addr) {
				temp.add(e);
			}
		}
		return temp;
	}
	
	@Override
	public void findEmployees() {
		//
		for(Employee e : list) {
			System.out.println(e);
		}
	}
}
