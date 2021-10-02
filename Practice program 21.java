class Counter02{ 
static int count=0;//will get memory only once and retain its value 
Counter02(){ 
count++; 
System.out.println(count); 
} 
public static void main(String args[]){ 
Counter02 c01=new Counter2(); 
Counter02 c02=new Counter2(); 
Counter02 c03=new Counter2(); 

} 
 }
