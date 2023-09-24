package Assignment;

public class SumArrays {
	
	public static void main(String[] args) {      
		int my_array[] = {12, 23, 34, 45, 56, 67, 78, 189, 912, 10234};
		int sum = 0;

		for (int i : my_array)
		    sum += i;
		System.out.println("The sum is " + sum);
		}

}
