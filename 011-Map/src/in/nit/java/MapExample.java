
package in.nit.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args)throws IOException {
		
		Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    map.put(7,"Shubham");
	    map.put(8,"Rutik");
	    map.put(9, "Dipali");
	    
	     
	    //Traversing Map  
		
		  Set set=map.entrySet();
  
		  Set set1 = map.entrySet();
		  //Converting to Set so that we can traverse 
		  Iterator itr=set.iterator(); 
		  Iterator itr1 =set.iterator(); 
		  while(itr.hasNext()){
		  //Converting to Map.Entry so that we can get key and value separately
		  Map.Entry entry=(Map.Entry)
				  itr.next();
		  System.out.println(entry.getKey()+" "+entry.getValue());
		  
		  }
		 
	    
	    
	    
	}

}
