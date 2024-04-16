package clover.infotech;

@FunctionalInterface
public interface MyInterfaceTwo {
	
	public void m2();
	
	
public class MyAppTwo {
	
	public static void main(String[] args) {
		MyInterfaceTwo mit =() -> System.out.println("M2 Method call");
		
		
		mit.m2();
	}
}

}
