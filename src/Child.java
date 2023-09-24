
public class Child extends Parent{

	public static void main(String[] args) {
		
		Child c=new Child();
		c.mul();
		c.div();
		c.add();
		c.sub();
		
		
	}

	public void mul() {
		System.out.println("Multiplication from Child class");
	}

	public void div() {
		System.out.println("Division");
	}
}
