package com.edu.cons;

import com.edu.cons.NoteBook;

// Programmer�� ������ ��� �ִ� Ŭ����
/*
 *  field:: �̸�, ��°�, ���, ����
 *  method:: 
 *  	1) filed �ʱ�ȭ
 *  	2) filed ��� �� ����
 */


	public class Programmer {
		
		public String Name;
		public String Adress;
		public String Skill;
		public int Salary;
		
		NoteBook noteBook;
		
		public void setNoteBook(NoteBook noteBook) {
			this.noteBook=noteBook;
		}
		
		public NoteBook getNoteBook() {
			return noteBook;
		}
		
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
