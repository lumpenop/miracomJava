package com.edu.test;


class Factory{
	
	private static Factory factory = new Factory();
	
	private Factory() {
		
	}
	
	public Factory getInstance() {
		
		return factory;
	}
}

public class StaticExamTest5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
