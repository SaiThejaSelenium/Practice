package pkg1;

public class CallingTable {
	
	public static void per(int a) {
		while (a>0) {
			System.out.println("This is table"+a);
			LoopingConditions.CaseCondition(a);
			a--;	
		}
		
		//if (a==0) {
		//	break
		//	System.out.println(a);
			
		//}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LoopingConditions.table(9, 1, 0, 20);
		//LoopingConditions.CaseCondition(8);
		CallingTable.per(6);

	}

}
