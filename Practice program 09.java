package swapnumber;
import java.util.*;

public class swapno {

	public static void main(String[] args) {  
		       int a, b, E;  
		       Scanner sc = new Scanner(System.in);  
		       System.out.println("Enter the value of a and b");  
		       a = sc.nextInt();  
		       b = sc.nextInt();  
		       System.out.println("before swapping numbers: "+a +"  "+ b);  
		       E = a;  
		       a = b;  
		       b = E;  
		       System.out.println("After swapping: "+a +"   " + b);  
		       System.out.println( );  
		    }    
		
	}
