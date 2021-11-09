package com.edu.test;
//1,2,3에 대한 설명...
class Member{
   static String name = "길동이"; // static V
   static int age = 19; // static V
   int count = 1; // field
   
   public static void getMember() {
      System.out.println("우/유/빛/깔/"+name);
   }
   
   //non-static
   public void getMember2() {
      //static String address = "한남동"; // address는 로컬 변수야. static에서는 안돼. 돌아가.
      System.out.println("우/유/빛/깔/"+name);
   }
   
   //static은 static끼리 통한다.
   public static void getMember3() {
      System.out.println("우/유/빛/깔/"+name);
      //count같은 애들은 non-static이라 static 안에서는 안된다.
   }
}

public class StaticExamTest1 {

   public static void main(String[] args) {
      // Member에 있는 getMember()를 사용...호출...
      // 객체 생성 필요 없이 클래스이름.으로 바로 사용가능..
      Member.getMember();
      
      //static 영역에서 non-static한 멤버는 사용 못 해. 객체를 생성해서 사용해야 함.
      //static은 static끼리 통한다.
      Member m = new Member();
      m.getMember2();

   }

}