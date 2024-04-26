package clover.infotech;

@FunctionalInterface
interface MyInterface{
	
	public void m();
	
}

public class MethodRef {
	
	public static void m2() {
		
		   System.out.println("This is m2() method");
		}

	public static void main(String[] args) {
		
		MyInterface mi = MethodRef::m2;
		
		mi.m();
		
		

	}

}
