
public class Main extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  Main t01=new Main();  
  Main t2=new Main();  
  System.out.println("Name of t1:"+t01.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t01.start();  
  t2.start();  
  
  t01.setName("Scooby");
  t2.setName("Shaggy");
  System.out.println("After changing name of t1:"+t01.getName());  
 }  
}
