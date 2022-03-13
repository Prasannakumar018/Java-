Public class Main{
Public static void main( String args[ ]){
 int num1,num2,result;
 Scanner sc= new Scanner(System.in);
 num1= sc.nextInt();
 num2= sc.nextInt();
 try{
 if(num2!=0){
    result = num1/num2;
   System.out.Print(result);
}
Catch (Arithmetic Exception e) { 
   System.out.print(" cannot divide by zero"+e);
}
}
