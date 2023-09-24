package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
	public static void main(String[] args)
    {
       
        ArrayList<String[]> list = new ArrayList<String[]>();
         
      
        String names[] = { "Raghu", "Prasad", "Bangalore" };
         
        String age[] = { "39", "40","41" };
          
        
        list.add(names);
        list.add(age);
        
        
        for (String i[] : list) {
            System.out.println(Arrays.toString(i));
        }
    }
}
