
public class ConstructorExample {

	//Constructor
 	public ConstructorExample() {
 		System.out.println("Constructor Example");
 	}
 	//Constructor with parameter
 	 	public ConstructorExample(String st) {
 	 		System.out.println(st);
 	 	}
 	 //Constructor with parameter
 	 	public ConstructorExample(int t) {
 	 		System.out.println("Number to print "+t);
 	 	}
	
	public static void main(String[] args) {
		
		ConstructorExample ce1=new ConstructorExample();
		ConstructorExample ce2=new ConstructorExample(200);
		ConstructorExample ce3=new ConstructorExample("Java Class");
		

	}

	public void Print() {
		System.out.println("Print values");
	}
}
