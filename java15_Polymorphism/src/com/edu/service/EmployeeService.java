package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * Employee�� �ڽ� Ŭ������
 * Manager, Engineer, Secretary ��ü���� �ڵ鸵�ϴ� ��ɸ����� �̷��� Service Ŭ����...
 * 
 *                     Employee
 *                  
 *                  
 *         Manager     Engineer     Secretary
 *         
 * 1step....���� ������������ �� ������ �ڵ鸵�Ҷ� ����ϴ� �޼ҵ� ���
 * ::
 * �߰��� ���õ� ����� �����ϴ� ���
 * public void addManager(Manager m){ //  }
 * public void insertEngieer(Engineer eg){ //  }
 * public void manageSec(Secretary sc){ //  }
 * 
 * 2step ....1�ܰ� ���ٴ� ���� ���� ����....�ϰ����� �ִ�.
 * public void addManager(Manager m){ //  }
 * public void addEngineer(Engineer eg){ //  }
 * public void addSecretary(Secretary sc){ //  }
 * 
 * 3step ....2�ܰ�� ��������� �ξ��� �ϰ����� �������� ���δ�
 * public void addEmployee(Manager m){ //  }
 * public void addEmployee(Engineer eg){ //  }
 * public void addEmployee(Secretary sc){ //  }
 * 
 * 4step.....3�ܰ�� ���� ������ ������ �� 1���� �����ϸ� �ȴ�.
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
         System.out.println("Engineer�� �����Դϴ�..");
         System.out.println(e.getSalary() * 12 + ((Engineer) e).getBonus());
      }
      if(e instanceof Manager) {
         System.out.println("Manager�� �μ��� �����մϴ�..");
         ((Manager) e).changeDept("������");         
      }
   }//
   
   public void printAllEmployee(Employee[ ] emps) {
      for(Employee e : emps)
         System.out.println(e.getDetails());
   }//
}//class