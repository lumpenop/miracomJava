package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;


/*
 * VO Class들을 핸들링 하는 기능만 모아놓은 서비스 클래스
 * 서비스 interface를 상속 받아서 작성함
 * 
 * 이러한 서비스 클래스는 클라이언트에서 여러 요청이 들어오더라도
 * 클래스 인스턴스를 단 하나 서버상에 만들어 두고
 * 요청을 처리하는 것은 서비스 클래스 내부의 메소드가 받아서 처리
 * -> Singletone Pattern
 * 
 * 추후 JDBC에서 Database 어플리케이션에서 사용
 * 
 * 싱클턴 패턴
 * 1. private static 객체 생성
 * 2. private으로 생성자 생성
 * 3. public static 메소드로 생성한 private 객체를 return하는 메소드 생성
 */
public class EmployeeListServiceImpl implements EmployeeListService{
	
	// 추가
	private ArrayList<Employee> list;

	
	// 싱글턴 추가
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
