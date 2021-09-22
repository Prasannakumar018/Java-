interface one1{
    void area();
    
}
public class two2 implements one1
{
    public void area(){
        int s1=3;
        System .out.println(s1*s1);
        
    }
    

public static void main(String args[])
{
    two2 o=new two2();
    o.area();
}
