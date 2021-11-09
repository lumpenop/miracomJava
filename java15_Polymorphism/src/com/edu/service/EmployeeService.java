package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * Employee의 자식 클래스인
 * Manager, Engineer, Secretary 객체들을 핸들링하는 기능만으로 이뤄진 Service 클래스...
 * 
 *                     Employee
 *                  
 *                  
 *         Manager     Engineer     Secretary
 *         
 * 1step....가장 저차원적으로 위 구조를 핸들링할때 사용하는 메소드 기법
 * ::
 * 추가에 관련된 기능을 정의하는 경우
 * public void addManager(Manager m){ //  }
 * public void insertEngieer(Engineer eg){ //  }
 * public void manageSec(Secretary sc){ //  }
 * 
 * 2step ....1단계 보다는 조금 나은 정의....일관성이 있다.
 * public void addManager(Manager m){ //  }
 * public void addEngineer(Engineer eg){ //  }
 * public void addSecretary(Secretary sc){ //  }
 * 
 * 3step ....2단계와 비슷하지만 훨씬더 일관성과 가독성을 높인다
 * public void addEmployee(Manager m){ //  }
 * public void addEmployee(Engineer eg){ //  }
 * public void addEmployee(Secretary sc){ //  }
 * 
 * 4step.....3단계와 같은 역할을 하지만 단 1번만 정의하면 된다.
 * public void addEmployee(Employee e){ 
 *    if(e instance Manager){
 *    }
 *  if(e instance Engineer){
 *  }
 *  if(e instance Secretary){
 *  }
 */
public class EmployeeService {
   public void manageEmployee(Employee e) {
      if(e instanceof Engineer) {
         System.out.println("Engineer의 연봉입니다..");
         System.out.println(e.getSalary() * 12 + ((Engineer) e).getBonus());
      }
      if(e instanceof Manager) {
         System.out.println("Manager의 부서를 변경합니다..");
         ((Manager) e).changeDept("오락부");         
      }
   }//
   
   public void printAllEmployee(Employee[ ] emps) {
      for(Employee e : emps)
         System.out.println(e.getDetails());
   }//
}//class