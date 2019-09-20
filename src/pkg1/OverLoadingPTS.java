package pkg1;
public class OverLoadingPTS {
	
	static int a;
	public OverLoadingPTS(int a) {
		System.out.println("I am org " + a);
		
		OverLoadingPTS.a=a;
		
	}

	public OverLoadingPTS() {
		// TODO Auto-generated constructor stub
	}

	public static void test() {
		System.out.println("I am test method");
		

	}

	public static void test(int a) {
		System.out.println("I am test a parameter");
		test();

	}

	public  void test(int a,int b) {
		
		System.out.println("I am test  parent a and b parameter");
		test(25);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new OverLoadingPTS().test(10,52);
		//OverLoadingPTS obj=new OverLoadingPTS(10);
		OverLoadingPTS.test(10);

	}

}
