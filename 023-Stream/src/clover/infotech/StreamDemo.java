package clover.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	// WAP find the no greater than 20 using stream
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(66,32,45,12,20);
		
		/*for(Integer i : list) {
			if(i>20) {
				System.out.println(i);
			}*/
		
		
		/*
		 * Stream<Integer> stream = list.stream();
		 * 
		 * Stream<Integer> filteredStream = stream.filter(i -> i > 20);
		 * 
		 * filteredStream.forEach(i -> System.out.println(i));
		 */
		 
		
		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
		
		
		}

	}
	



