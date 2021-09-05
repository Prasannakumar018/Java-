class Calculation{ 
void sum(int a1,int b1){
System.out.println(a1+b1);
} 
void sum(int a1,int b1,int c1){
System.out.println(a1+b1+c1);
} 

   public static void main(String args[]){ 
   Calculation obj1=new Calculation(); 
   obj1.sum(10,10,10); 
   obj1.sum(20,20); 

 } 
}
