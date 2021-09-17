class Teststringcomparison01{  
 public static void main(String args[]){  
   String s01="java";  
   String s02="program";  
   String s03=new String("program");  
   String s04="java";  
   System.out.println(s01.equals(s02));
   System.out.println(s01.equals(s03));
   System.out.println(s01.equals(s04));
 }  
}
