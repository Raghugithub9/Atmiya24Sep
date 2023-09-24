
public class RaghuBank implements Bank{

	public static void main(String[] args) {
		
		RaghuBank rb=new RaghuBank();
		rb.credit();
		rb.debit();
		rb.loans();
		rb.insurance();

		Bank b=new RaghuBank();
		b.credit();
		b.debit();
		b.loans();
		
		
		
	}
	public void credit() {
		System.out.println("Credit");
	}
	public void debit() {
		System.out.println("Debit");
	}
	public void loans() {
		System.out.println("Loans");
	}
	public void insurance() {
		System.out.println("Insurance");
	}

}
