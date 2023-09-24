package Exceptions;

public class ThrowExample {
	
	 
    public static void main(String args[]){  
         
        validate(25);  
        System.out.println("Print the Text");    
  } 
	
	public static void validate(int age) {  
        if(age<18) {  
              
            throw new ArithmeticException("No vote");    
        }  
        else {  
            System.out.println("Can vote");  
        }  
    }  
       
}
