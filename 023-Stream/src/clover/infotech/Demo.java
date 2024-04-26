package clover.infotech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		Person p1 = new Person("John","USA");
		Person p2 = new Person("Shubham", "india");
		Person p3  = new Person("Ashok", "CHINA");
		Person p4 = new Person("Ching", "Landon");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		boolean status1 = persons.stream().anyMatch(p -> p.country.equals("INDIA"));
		System.out.println("Any India Available ? :: "+persons);
		
		boolean status2 = persons.stream().anyMatch(p ->p.country.equals("CANADA"));
		System.out.println("Any Canadian Available ? :: "+ status2);
		
		boolean status3 = persons.stream().allMatch(p -> p.country.equals("INDIA"));
		System.out.println("All Person from India ? ::"+ status3);
		
		boolean status4 = persons.stream().noneMatch(p ->p.country.equals("MEXICO"));
		
		List<Person> indians = persons.stream()
		         .filter(p -> p.country.equals("INDIA"))
		         .collect(Collectors.toList());
		
		indians.forEach(i -> System.out.println(i));
		         
	}
	
	
}
	class Person {
		
		String name;
		String country;
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		

		public Person() {
			super();
		}

		public Person(String name, String country) {
			super();
			this.name = name;
			this.country = country;
		}

		@Override
		public String toString() {
			return "Persion [name=" + name + ", country=" + country + "]";
		}
		
		
		
		
	}


