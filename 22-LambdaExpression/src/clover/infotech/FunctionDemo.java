package clover.infotech;

import java.util.function.Function;

//Retrive student record based on student id and return that record

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String , Integer> f = (name) -> name.length();
		
		System.out.println(f.apply("ashokIt"));
		System.out.println(f.apply("hyd"));
	
	}

}
