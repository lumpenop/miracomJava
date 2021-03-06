package com.edu.test;
/*
 * EmployeeService 클래스에 기능들을 다 모아놓았다.
 * EmployeeService 객체를 생성하고 / 메소드를 호출..
 */
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeServiceImpl;
import com.edu.util.MyDate;

public class HeterogeneousTest3 {
   public static void main(String[] args) {
      Employee[ ] emps = {
            new Manager("James", new MyDate(1990,1,1), 30000.0, "IT"),
            new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000),
            new Secretary("Jane", new MyDate(1985,1,1), 350000.0, "Tom"),
            new Manager("Peter", new MyDate(1982,2,11), 50000.0, "Python"),
            new Manager("Juliet", new MyDate(1992,3,1), 65000.0, "Education")
      };
      
      EmployeeServiceImpl service = new EmployeeServiceImpl();
      service.manageEmployee(emps[0]); //Manager James를 입력
      service.manageEmployee(emps[1]); //Engineer Tom를 입력
      
      service.printAllEmployee(emps);
      
   }//main
}//class
