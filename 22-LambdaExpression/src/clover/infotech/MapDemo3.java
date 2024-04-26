package clover.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {

	public static void main(String[] args) {
		
	 List<String> javacource = Arrays.asList("core Java" ," adv java", "spring boot");
	 List<String> uicource = Arrays.asList("HTML" , "CSS" , "bs" , "js");
	 
	 
	 List<List<String>> cource = Arrays.asList(javacource,uicource);
	 
	// cource.stream().forEach(c -> System.out.println(c));
	 
	 Stream<String> flatMap = cource.stream().flatMap(s -> s.stream());
	 
	 flatMap.forEach(c -> System.out.println(c));
		
	 
	}
	
}
