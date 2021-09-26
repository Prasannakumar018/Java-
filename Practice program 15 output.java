class Animal01{  
void eat(){
System.out.println("eating...");
}  
}  

class Dog extends Animal01{
  
void bark(){
System.out.println("barking...");
}  
}  

class BabyDog extends Dog{  
void weep()
{
System.out.println("weeping...");
}  
}  


class TestInheritance02{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}
