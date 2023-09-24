package Exceptions;

public class TryCatchExample {

	 public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0;  
	        System.out.println("Second Line won't execute");
	        }  
	          
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("Test");  
	    }  
	      
	 
}
