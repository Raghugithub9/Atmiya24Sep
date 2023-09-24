package Exceptions;

public class NewExceptions {

	public static void main(String[] args) {

		try {
			System.out.println("Starting of Array");
int a[] =new int[3];

		a[0]=123;
		a[0]=1234;
		
		final int b=10;
		System.out.println(b);
		//b=20;
		System.out.println(b);
		
		
	System.out.println("Ending of Array");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Catch Block");
		}
		
		finally {
			System.out.println("Mandatory to execute");
		}
	}
}


