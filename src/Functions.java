
public class Functions {

	
	public static void main(String[] args) {
		addition(100,200);
		addition(200,345);
		addition(123,234);
		addition(123);
		Test(1234);
	}

	public static void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void addition(int a) {
		
		System.out.println(a);
	}
	
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void Test(int a) {
	
		System.out.println(a);
	}
	
}
