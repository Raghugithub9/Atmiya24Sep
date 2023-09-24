package Test;

public class ProtectedExample {

	public static void main(String[] args) {
		
		ProtectedExample pe=new ProtectedExample();
		pe.PrintProtected();
		
	}

	protected void PrintProtected() {
		System.out.println("Protected Example");
	}
}
