class Employee{  
 float salary01=40000;  
}  
class Programmer extends Employee{  
 int bonus01=10000;  
 public static void main(String args[]){  
   Programmer p01=new Programmer();  
   System.out.println("Programmer salary is:"+p01.salary01);  
   System.out.println("Bonus of Programmer is:"+p01.bonus01);  
}  
}  
