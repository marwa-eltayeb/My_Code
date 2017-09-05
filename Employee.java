package carsimulator;

import HR.Vacation;


public class Employee {
   
   public String firstName;
   public String lastName;
   public int age;
   public String address;
   public String tel;
   public double salary;
   public Car mycar;  //Reference to object  (Object Datatype)
   
   
   public Employee(String firstName,String lastName,int age, double salary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.salary = salary;
  }
   
   
   public double getRaise(double raise){
       salary = salary + salary * raise;
       return salary;
   }
   
   
   public void takeVacation(){
       Vacation v = new Vacation();
       //v.days = 10;
   }
    
    
    
    
    
    
    
}
