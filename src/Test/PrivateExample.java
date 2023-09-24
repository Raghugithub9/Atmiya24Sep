package Test;

public class PrivateExample {

	public static void main(String[] args) {
		
		PrivateExample pe=new PrivateExample();
		pe.test();

	}
	
	private void test() {
		System.out.println("Private Access");
	}

}
