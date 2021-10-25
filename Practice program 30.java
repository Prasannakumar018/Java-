//Example of this keyword that you return as a statement from the method
public class A01{ 
A01 getA(){ 
return this; 
} 
void msg(){System.out.println("Hello to java world");} 
} 

class Test1{ 
public static void main(String args[]){ 
new A01().getA().msg(); 
} 
}
