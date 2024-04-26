package clover.infotech;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ashok", "Raja","Rani","Johan","Akash","Chales");
		
		//Print name with its length which are starting with 'A' Stream API
		
		names.stream()
		    .filter(name -> name.startsWith("A"))
		    .map(name -> name + "-" +name.length())
		    .forEach(name -> System.out.println(name));
		
		

	}

}
