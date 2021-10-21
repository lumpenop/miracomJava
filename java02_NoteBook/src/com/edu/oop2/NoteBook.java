package com.edu.oop2;

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
	
	public void setNoteBookInfo(String brandName, int price, int serialNumber) {
		
		/*
		 *  this:: 이 위치에서의 this는 필드와 로컬변수의 이름이 같을 때 구분하기 위해 사용됐다
		 *  this는 주소값을 가지고 있는 ?
		 */
				
		this.brandName = brandName;
		this.price = price;
		this.serialNumber = serialNumber;
	}
}
