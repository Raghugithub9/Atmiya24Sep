
public class LocalGlobalExample {

	//Global variable
	static int a=100;
	
	
	public static void main(String[] args) {
		int c=300;
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);

	}
	
	
	public static void Print() {
		//Local variable
		int b=200;
		System.out.println("Print Local");
		System.out.println(a);
	}

}
