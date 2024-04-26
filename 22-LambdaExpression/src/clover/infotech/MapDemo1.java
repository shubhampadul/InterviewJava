package clover.infotech;

import java.util.stream.Stream;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Rajeshware" , 35, 55000.00);
		Employee1 e2 = new Employee1("David", 25, 45000.00);
		Employee1 e3 = new Employee1("Buttler", 35, 35000.00);
		Employee1 e4 = new Employee1("Steve", 45, 65000.00);
		
      //Get the emp name and emp age whose salary is >= 50,000 using stream Api.		
		
		Stream<Employee1> stream =Stream.of(e1,e2,e3,e4);
		stream.filter(e -> e.salary >= 50000.00)
		.forEach(e -> System.out.println(e.name + "-" + e.age));
	}
}
	
	class Employee1 {
		
		String name;
		int age;
		double salary;
		
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee1(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
		
	}


