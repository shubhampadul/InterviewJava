package clover.infotech;

import java.util.function.Predicate;

//Declare name in array and print names which start are starting with 'A' using lambda expression

public class PredicateDemo2 {

	public static void main(String[] args) {
		
			String[] names = {"Anushka","Anupama","Deepika","Kajol","Sunny"};
			
			Predicate<String> p = name -> name.charAt(0) == 'A';
			
			for (String name : names) {
				if(p.test(name)) {
					System.out.println(name);
				}
			}
	}

}
