class FibonacciExample01{  
public static void main(String args[])  
{    
 int m1=0,m2=1,m3,n,count=10;    
 System.out.print(m1+" "+m2); 
    
 for(n=2;n<count;++n)
 {    
  m3=m1+m2;    
  System.out.print(" "+m3);    
  m1=m2;    
  m2=m3;    
 }    
  
}}  
