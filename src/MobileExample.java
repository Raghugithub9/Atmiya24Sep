
public class MobileExample {

	public static void main(String[] args) {
		//To call static function
		calling();
		MobileExample.calling();
		
		//To call static and non static
		MobileExample m1=new MobileExample();
		MobileExample m2=new MobileExample();
		MobileExample m3=new MobileExample();
		MobileExample m4=new MobileExample();
		m1.calling();
		m1.chatting();
		m2.chatting();
		
		new MobileExample().chatting();
		
		//new MobileExample(); - Object
		//m1 - Object Reference
	}
	
	//static
	public static void calling() {
		System.out.println("Call to a number");
	}

	//Non static
	public  void chatting() {
		System.out.println("Chat to a number");
	}
}
