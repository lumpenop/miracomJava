package com.edu.datatype;


class Date{
	int year;
	int month;
	int day;
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getDate() {
		return year + "-" + month + "-" + day;
	}
}

class WhiteBoard{
	String company;
	char color;
	String material;
	double price;
	Boolean scratch;
	Date madeDate;
	
}

public class WhiteBoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
