
public class TestBank extends HdfcBank{

	public static void main(String[] args) {
		
		TestBank t=new TestBank();
		t.credit();
		t.debit();
		t.loans();
		RaghuBank rb=new RaghuBank();
		rb.credit();
	}

	
	public void loans() {
		System.out.println("Loans");
		
	}


	@Override
	public void debit() {
		System.out.println("Debit");
		
	}

}
