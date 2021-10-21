package com.edu.test;


class Operator{
	public boolean test1() {
		System.out.println("test1()...calling");
		return true;
	}
	
	
	public boolean test2() {
		System.out.println("test2()...calling");
		return false;
	}
	
}

public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operator a = new Operator();
		
		System.out.println(a.test1());
	}

}
