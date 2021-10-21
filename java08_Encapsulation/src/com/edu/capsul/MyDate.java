package com.edu.capsul;

public class MyDate {
	private int month;
	private int day;
	
	
	public int getMonth() {
		
		if (month == 0) {
			System.out.println("date를 세팅해주세요");
			System.exit(0);
		}
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 & month <= 12) {
			this.month = month;			
		}else {
			System.out.println("1~12 사이의 값을 입력해주세요");
		}
		
	}
	public int getDay() {
		
		if (day == 0) {
			System.out.println("date를 세팅해주세요");
			System.exit(0);
		}
		return month;
	}
	public void setDay(int day) {
		
		
		
		switch(month) {
			case 1: case 3: case 5: 
			case 7: case 8: case 10: case 12:
				if(day >= 1 & day <= 31) {
					this.day = day;
					
				}else {
					System.out.println("일자를 확인해주세요");
				}
				
				break;
			
			case 4: case 6:
			case 9: case 11:
				if(day >= 1 & day <= 30) {
					this.day = day;
					
				}else {
					System.out.println("일자를 확인해주세요");
				}
				break;
				
			case 2: 
				if(day >= 1 & day <= 28) {
					this.day = day;
				}else {
					System.out.println("일자를 확인해주세요");
				}
				break;
					
		}
		
	}
	
	
}
