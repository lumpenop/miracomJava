package com.edu.oop;

public class NoteBook {

	public String brandName;
	public int price;
	public int serialNumber;
	
	public void printInfo() {
		System.out.println("NoteBook Brand :: " + brandName + ", Price ::" + price
				+ ", Number ::" + serialNumber);
	}
	
	
	public String getBrandName() {
		return "NoteBook BrandName :: " + brandName;
	}
}
