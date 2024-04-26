package clover.infotech;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstDemo {

	//WAJP GET MAX ,MIN AVG Sal frome given employee using stream Api.
	
	public static void main(String[] args) {
		Employee e1  = new Employee(2, "Shubham", 46000.00);
		Employee e2 = new Employee(3, "Ching", 36500.00);
		Employee e3 = new Employee(4, "Sandesh", 85000.00);
		Employee e4 = new Employee(5, "Rajeshware",56000.00);
		
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		
		
		//Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
	
		
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary ::"+ max.get().salary);
		
		
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salary ::" + min.get().salary);
		
	}
}

class Employee {
	int id;
	String name;
	double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
