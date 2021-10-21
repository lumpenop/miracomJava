package com.edu.cons.test;


// Programmer의 정보를 담고 있는 클래스
/*
 *  field:: 이름, 사는곳, 기술, 연봉
 *  method:: 
 *  	1) filed 초기화
 *  	2) filed 모든 값 리턴
 */
	public class Programmer {
		
		public String Name;
		public String Adress;
		public String Skill;
		public int Salary;
		
		public Programmer(String Name, String Adress, String Skill, int Salary) {
			this.Name = Name;
			this.Adress = Adress;
			this.Skill = Skill;
			this.Salary = Salary;
		}
		
		public void setProgrammerInfo(String Name, String Adress, String Skill, int Salary) {
			this.Name = Name;
			this.Adress = Adress;
			this.Skill = Skill;
			this.Salary = Salary;
		}
		
		public String getProgrammerInfo() {
			
			return "Name:: " + this.Name + ", Adress:: " + this.Adress + ", Stack:: " + this.Skill + ", Salary:: " + this.Salary;
			
		}
		
		public int getAnnualSalary() {
			return Salary * 12;
		}
		

		
}
