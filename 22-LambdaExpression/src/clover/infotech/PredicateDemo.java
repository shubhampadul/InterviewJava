package clover.infotech;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
	Predicate<Integer> p =	i -> i > 10;
	
	System.out.println(p.test(5));
	System.out.println(p.test(15));
	
	BiPredicate<Integer, Integer> bip = (i, j) ->(i + j) >=20;
		
	
	
	}

}
