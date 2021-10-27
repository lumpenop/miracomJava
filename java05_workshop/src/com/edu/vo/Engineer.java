package com.edu.vo;

public class Engineer extends Employee{
	
	private String tech;
	private double bonus;
	
	public Engineer() {
		super();
	}

	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super(name, birthDate, salary);
		// TODO Auto-generated constructor stub
		
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	
	
}
