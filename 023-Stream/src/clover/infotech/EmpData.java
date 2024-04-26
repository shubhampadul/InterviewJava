package clover.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {
		
		List<Emp> emps = new ArrayList<Emp>();
		
		emps.add(new Emp(1, "Shubham", 26, "Male", "Development", 2019, 26000.00));
		emps.add(new Emp(2, "Ashok", 36, "Male", "Development", 2012,75000.00));
		emps.add(new Emp(3, "Umesh", 28, "Male", "Sales", 2019, 56000.00));
		emps.add(new Emp(4, "David", 29, "Male", "Security", 1998, 85000.00));
		emps.add(new Emp(5, "Kajal", 35, "Female", "Finance", 2020, 52000.00));
		emps.add(new Emp(6, "Rutuja", 29, "Female", "Infrastructor", 2012, 52000.00));
		emps.add(new Emp(1, "Rajeshware", 56, "Male", "Development", 2018, 28000.00));
		emps.add(new Emp(2, "Nitin", 29, "Male", "Development", 2023,75000.00));
		emps.add(new Emp(3, "Apurva", 26, "Female", "Sales", 2020, 56000.00));
		emps.add(new Emp(4, "Pankaj", 26, "Male", "Security", 2022, 86000.00));
		emps.add(new Emp(5, "Kiran", 33, "Female", "Finance", 2021, 52000.00));
		emps.add(new Emp(6, "Sachin", 25, "Male", "Infrastructor", 2015, 56000.00));
		 
		
		//How many male and female employees are there in the orgnization
		
		/*
		 * Map<String, Long> map1 =
		 * emps.stream().collect(Collectors.groupingBy(Emp::getGender,
		 * Collectors.counting()));
		 * 
		 * System.out.println("How many male and Female:"+map1);
		 */
		
		//print the name of all department organization
		
		/*
		 * emps.stream().map(e ->e.department) .distinct() .forEach(name ->
		 * System.out.println(name));
		 */
		//what is avarage age and female employee
		
		Map<String, Double> map = emps.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getAge)));
		
		System.out.println(map);
	}

}

class Emp {
	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearsOfJoining;
	double salary;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getYearsOfJoining() {
		return yearsOfJoining;
	}



	public void setYearsOfJoining(int yearsOfJoining) {
		this.yearsOfJoining = yearsOfJoining;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Emp(int id, String name, int age, String gender, String department, int yearsOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearsOfJoining = yearsOfJoining;
		this.salary = salary;
	}
	
	
}
