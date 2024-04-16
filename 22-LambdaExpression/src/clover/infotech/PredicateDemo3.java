package clover.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//list of persons and print persons whose age greater than 18 

class Persion{
	
	public Integer age;
	public String name;
	
	public Persion(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	

}
//list of persons and print persons whose age greater than 18 

public class PredicateDemo3 {
	

	public static void main(String[] args) {
		
	 Persion p1 = new Persion(25,"Shubham");
	 
	 Persion p2 =  new Persion(30,"Rajeshware");
	 
	 Persion p3 = new Persion(15, "Rahul");
	 
	 Persion p4 = new Persion(75, "Apasaheb");
	 
	 List<Persion> persion = Arrays.asList(p1,p2,p3,p4);
	 
	Predicate<Persion> predicate = p -> p.age >=18;
	
	for (Persion person : persion) {
		if(predicate.test(person)) {
			System.out.println(person.name);
		}
		
	}
	 
	 

	
		
	}

}
