package com.edu.collection.vo;


/*
 * VO Class (Value Object)
 * 
 * DB table 내의 하나의 Row를 인스턴스화 시킨 객체
 * VO의필드가 DB 테이블의 컬럼으로 매핑
 * 
 *  1. private 필드
 *  2. 생성자 2개 (기본 생성자, 명시적 생성자)
 *  3. setter / getter 
 *  4. toString() overriding
 */

public class Person {
	private String name;
	private String address;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + ", " + address + ", " + age;
		}
	
	
	
}
