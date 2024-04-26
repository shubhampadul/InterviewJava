package clover.infotech;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
 
	//WAP store the name in Array and find the whose form star A
	public static void main(String[] args) {
		
		List<String> names =  Arrays.asList("Rahul","Akshay", "Amol","Rajeshware", "Shubham");
		
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
		
		

	}

}
