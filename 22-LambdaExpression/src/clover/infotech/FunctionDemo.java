package clover.infotech;

import java.util.function.BiFunction;
import java.util.function.Function;

//Retrive student record based on student id and return that record

//take 2 input and perform some of two Input and return o/p

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String , Integer> f = (name) -> name.length();
		
		System.out.println(f.apply("ashokIt"));
		System.out.println(f.apply("hyd"));
		System.out.println(f.apply("Sachin"));
		
	 BiFunction<Integer, Integer, Integer>	bifunction = (a, b) -> a+b;
	 
	 System.out.println(bifunction.apply(10, 30));
	
	}

}
