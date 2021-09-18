import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
     String str01 = "Hello";
     String str02 =" My java";
     System.out.println(str1==str2);
     Boolean newStr = str01.equals(str2);
     System.out.println(newStr);
     int strlen = str01.length();
 
     System.out.println(strlen);
    char newStr1= str02.charAt(4); 

    String U= str01.toUpperCase();
    System.out.println(U); 
    String l= str01.toLowerCase();
    System.out.println(l);
    
    String newStr03 = str02.replace("My","Our");
    System.out.println(newStr03 + "\n"+newStr1);
  
    String t = str02.trim();
    System.out.println(t);
    Boolean con = str02.contains("java"); 

    System.out.println(con);
   }
 }
