
public class LoopsExample {

	public static void main(String[] args) {
	
	//i++ - increment i+1
		
	for(int i=0;i<10;i++) {//i=0,1,2,3,4,5,6,7,8,9
		System.out.println("Java Class "+i);
	}
	
	//j-- - decrement j-1
	System.out.println("********************");
	for(int j=5;j>0;j--) {//j=5,4,3,2,1
		System.out.println("Java Class "+j);
	}
	
	//Nested ForLoop
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	for(int k=0;k<3;k++) {//k=0,1,2
		System.out.println("Java Class k "+k);
		for(int l=0;l<2;l++) {//l=0,1 -- 0,1-- 0,1
			System.out.println("Java Class l "+l);
		}
	}	
	
	
	
	

	}

}
