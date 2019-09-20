package pkg1;

public class Class2 {
	public void m4() {
		System.out.println("I am from method m4");
	}
	public static void m5() {
		System.out.println("I am from method m5");
	}
	public static void m6() {
		System.out.println("I am from method m6");
		new Class2().m4();
		m5();
		new Class1();
		Class1.m3();
	}
	public static void main(String[] args) {
		m6();		
	}
   
}
