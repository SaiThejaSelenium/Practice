package opps_prac;

public class Accessmodifi {
	
	public static String City="Chennai";
	
	public static void test()
	{
		System.out.println("I am public method");
	}
	
	private static String Office="OTP";
	
	private static void demo() {
		System.out.println("I am demo Private method");
	}
	
	protected String dist="Nellore";
	
	protected static void m1() {
		System.out.println("I am m1 protected method");
	}
	
	String post="UTKR";
	static void M2() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("I am method M2");
	}
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		demo();
		System.out.println(Office);
		M2();

	}

}
