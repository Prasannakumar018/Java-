import java.util.*;
class Main{
  public static void Palindrome(String s){
    String reverse = new StringBuffer(s).reverse().toString();
    if (s.equals(reverse)){
      System.out.println("Yes, it is a palindrome");
    }
    else{
      System.out.println("No, it is not a palindrome");
    }
}
 
public static void main (String[] args){
  Palindrome("erre");
}
}
