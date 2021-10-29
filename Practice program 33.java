class myexception extends exception{
   string str01;
   myexception(string str2) {
	str01=str02;
   }
   public string tostring(){ 
	return ("myexception occurred: "+str01) ;
   }
}

class example1{
   public static void main(string args[]){
	try{
		system.out.println("starting of try block");
		// i'm throwing the custom exception using throw
		throw new myexception("this is my error message");
	}
	catch(myexception exp){
		system.out.println("catch block") ;
		system.out.println(exp) ;
	}
   }
}
