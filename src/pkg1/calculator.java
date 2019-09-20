package pkg1;

public class calculator {
//	static double a;
//	static double b;
	public static double Addition(double a,double b)
	{
		double c=a+b;
		return c;
		
	}
	public static double sub(double a,double b)
	{
		double c=a-b;
		return c;
	}
	public double mul(double a,double b)
	{
		double c=a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float addi = new calculator().Addition(a,b);
		double addit = Addition (10.00,20.00);
		double subtra =sub(20.00,10.00);
		double mult =new calculator().mul(10,2);
		System.out.println(addit);
		System.out.println(subtra);
		System.out.println(mult);

	}

}
