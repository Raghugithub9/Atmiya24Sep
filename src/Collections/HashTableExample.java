package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(String args[]){  
		 
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Raghu1");  
		  hm.put(101,"Raghu2"); 
		  hm.put(102,"Raghu3"); 
		  hm.put(103,"Raghu3");  
		  hm.put(105,"Raghu4");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
