package clover.infotech;

import java.util.stream.Stream;
	
//filter those user is greate than 20
public class UserDemo {
		public static void main(String[] args) {
			
			User u1 = new User("Shubham", 25);
			User u2 = new User("Raja", 18);
			User u3 = new User("Aahul", 25);
			User u4 = new User("Rameshware", 65);
			
			Stream<User> stream = Stream.of(u1,u2,u3,u4);
			
			
			//stream.filter(u -> u.age >= 19).forEach(u -> System.out.println(u));
			
			//stream.filter(u -> u.age >= 19 && u.name.startsWith("A")).forEach(u -> System.out.println(u));
			
			stream.filter(u -> u.age >= 18)
			   .filter(u -> u.name.startsWith("A"))
			   .forEach(u -> System.out.println(u));
		}
	} 
		
		class User {

			String name;

			int age;

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
			public User(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return "User [name=" + name + ", age=" + age + "]";
			}
			
			
		}
