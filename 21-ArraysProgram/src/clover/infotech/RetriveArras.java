package clover.infotech;

import java.util.stream.Stream;

//retrive array
public class RetriveArras {

	public static void main(String[] args) {
		
		//create the array
		String[] names= {"Shubham" , "pratik" , "Dipak"};
		
		System.out.println("========Approach -1==================");
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("==========Approach - 2================");
		
		for(String name : names) {
			
			System.out.println(name);
			
		}
		
		System.out.println("===========Approach=====================");
		Stream.of(names).forEach(name ->System.out.println(name));
		
		System.out.println("==========store Arrays revers order============");
		for(int i = names.length-1;i >= 0;i--) {
			System.out.println(names[i]);
			
			
		}
	}

}
