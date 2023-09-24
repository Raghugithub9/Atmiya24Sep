package Assignment;

public class IndexArray {
	
	public static void main(String[] args) {
	      int[] my_array = {251, 114, 526, 135, 346, 556, 767, 178, 299, 479};
	      System.out.println("Index position of 25 is: " + findIndex(my_array, 299));
	      System.out.println("Index position of 77 is: " + findIndex(my_array, 135));
	       }
	
	
	
	public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    
}
