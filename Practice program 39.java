class S201{ 
void m(S201 obj){ 
System.out.println("method is invoked"); 
} 
void p(){ 
m(this); 
} 

public static void main(String args[]){ 
S2 s1 = new S2(); 
 s1.p(); 
 } 
}
