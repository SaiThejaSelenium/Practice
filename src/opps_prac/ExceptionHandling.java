package opps_prac;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			//Thread.sleep(5000);
			System.out.println(a);
			int b=0;
			Thread.sleep(5000);
			System.out.println(b);
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
			throw new ArithmeticException("not divisable by 0");
		}finally{
			System.out.println("This is finally block");
		}

	}

}
