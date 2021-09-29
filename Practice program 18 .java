class Counter{ 
int count01=0;//will get memory when instance is created 
Counter(){ 
count01++; 
System.out.println(count01); 
 } 
public static void main(String args[]){ 
Counter c1=new Counter(); 
Counter c2=new Counter(); 
Counter c3=new Counter(); 

} 
 }
