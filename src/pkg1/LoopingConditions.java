package pkg1;

public class LoopingConditions {
	public static void table(int a, int b, int c, int d) {
		while (b <= d) {
			c = a * b;
			System.out.println(a + "x" + b + "=" + c);
			b++;
		}
	}

	public static void CaseCondition(int a) {
		int b = 0;
		int d = 0;
		int c = 0;
		while (a >= d) {
			b++;
			c = a * b;
			System.out.println(a + "x" + b + "=" + c);
			if (b == 10) {
				break;
			}
		}

	}

	public static void tables(int table) {

		for (int a = 1; a <= table; a++) {
			System.out.println("Table is : " + a);
			for (int i = 1; i <= 10; i++) {

				System.out.println(a + "X" + i + "=" + a * i);

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// table(8, 1, 0, 10);

		// CaseCondition(6);
		tables(100);

	}

}
