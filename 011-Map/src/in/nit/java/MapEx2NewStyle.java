package in.nit.java;

import java.util.HashMap;
import java.util.Map;

public class MapEx2NewStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(4, "Rupali");
		//Add the element key with value
		map.put(3, "shubham");
		map.put(5, "Raja");
		map.put(1, "Dev");
		
		 //Elements can traverse in any order 
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}
		
	
	
				
				
		

	}

