package clover.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// print employee emp names who are working in Hyd location in DB team
class Employee{
	
	String name;
	String location;
	String dept;
	
	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
	
}
public class PredicateDemo4 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Shubham", "Pune", "Devops");
		
		Employee emp2 = new Employee("Rani", "Hyd", "DB");
		
		Employee emp3 = new Employee("Ashok", "Hyd" ,"Tsting");
		
		Employee emp4 = new Employee("Saurabh", "Sambhaji Nagar", "Developing");
		
		List<Employee> emps = Arrays.asList(emp1, emp2, emp3, emp4);
		
		//Predicate Joiner
	
	    Predicate<Employee> p1 = (e) -> e.location.equals("Hyd");
		
	    Predicate<Employee> p2 = (e) -> e.dept.equals("DB");
	    
	    //Predicate Joining 
	    Predicate<Employee> p = p1.and(p2);
	    
	    for(Employee e : emps) {
	    	if(p.test(e)) {
	    		System.out.println(e.name);
	    	}
	    }
		
	

	}

}
