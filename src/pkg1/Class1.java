package pkg1;

public class Class1 {
	//public static void main(String[] args){
		//System.out.println("Hi");
		//System.out.println("Hello");
		//System.out.println("World");
	//}
	public void m1() {
		System.out.println("I am in M1 method");
		m2();
	}
	public static void m2() {
		System.out.println("I am in M2 Method");
		//new Class1().m1();
		//new Class1().m3();
		//m3();
	}
	public static void m3() {
		System.out.println("I am in M3 Method");
		new Class1().m1();
		//m2();
		
	}
	public static void main(String[] args) {
		//Class1 comp = new Class1();
		//comp.m1();
		new Class1();
		Class1.m3();		
		
	}

}
