package com.edu.cons.test;

public class NoteBook {

	public String brandName;
	public int price;
	public int serialNumber;
	
	public NoteBook(String string, int i, int j) {
		this.brandName = string;
		this.price = i;
		this.serialNumber = j;
	}


	public void printInfo() {
		System.out.println("NoteBook Brand :: " + brandName + ", Price ::" + price
				+ ", Number ::" + serialNumber);
	}
	
	
	public String getBrandName() {
		return "NoteBook BrandName :: " + brandName;
	}
	
	public void setNoteBookInfo(String brandName, int price, int serialNumber) {
		
		/*
		 *  this:: �� ��ġ������ this�� �ʵ�� ���ú����� �̸��� ���� �� �����ϱ� ���� ���ƴ�
		 *  this�� �ּҰ��� ������ �ִ� ?
		 */
				
		this.brandName = brandName;
		this.price = price;
		this.serialNumber = serialNumber;
	}
}