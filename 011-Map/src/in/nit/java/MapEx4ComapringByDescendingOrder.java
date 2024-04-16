
package in.nit.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapEx4ComapringByDescendingOrder {

	public static void main(String[] args) {

	Map<Integer,String> map=new HashMap<Integer, String>();
	 //Add element
	 map.put(101,"Amit");
	 map.put(102, "Rohit");
	 map.put(103,"Rutuza");
	 //Returns a Set view of the mappings contained in this map        
    map.entrySet()
     //Returns a sequential Stream with this collection as its source  
     .stream()
     //Sorted according to the provided Comparator  
     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
     //Performs an action for each element of this stream  
     .forEach(System.out::println);  
		
			
		}
	}
		
				
				
		

	

