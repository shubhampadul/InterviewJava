package in.nit.java;

public class Demo {
	
	public void demoMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void demoMethod(float a , double b) {
		System.out.println(a-b);
		
	}
	public void demoMethod(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void demoMethod(Double a,int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.demoMethod(10, 20);
		d.demoMethod(10,20,30);
		d.demoMethod(105.89,85);
		d.demoMethod(20.56f, 12.12);
	}
	
}
