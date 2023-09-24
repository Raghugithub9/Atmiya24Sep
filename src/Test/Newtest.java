package Test;

public class Newtest {

	
	public static void main(String[] args) {

		PrivateExample pe1=new PrivateExample();
		//pe1.test();
		
		DefaultExample de=new DefaultExample();
		de.defaultTest();
		
		ProtectedExample pe2=new ProtectedExample();
		pe2.PrintProtected();

	}
}
