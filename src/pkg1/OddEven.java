package pkg1;

public class OddEven {
	
	public static void even() {
		int n = 100;
		System.out.println("Even numbers from 1 to 100 are:");
		for (int i = 1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i + ",");
			}
		}		
		
	}
	
	public static void odd() {
		int n = 100;
		System.out.println(" ");
		System.out.println("Odd numbers from 1 to 100 are:");
		for (int i = 1; i<=n; i++) {
			if(i%2!=0) {
				System.out.print(i + ",");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		even();
		odd();

	}

}
