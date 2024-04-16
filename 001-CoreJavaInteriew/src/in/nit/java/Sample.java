package in.nit.java;

public class Sample extends Demo {
	
	public static void demoMethod() {
		System.out.println("Method Child");
	}

	public static void main(String[] args) {
		Demo d=new Sample();
		d.demoMethod();
		d.basic();

	}

}
