package pkg1;

public class ObjectArrayTask {
	
	public static void objArray() {
		String[] str= {"Hi","Sai","Theja"};
		int[] in = {1,2,3};
		Object[][] con= new Object[3][2];
//		System.out.println(str[0]+" "+str[1]+" "+str[2]);
//		System.out.println(in[0]+" "+in[1]+" "+in[2]);
//		//System.out.println(con[0]+" "+con[1]+" "+con[2]);
//		
//		int rows= str.length+in.length;
//		int result[]= new int[rows];
//		int pos=0;
//		for (String element : str) {
//			result[pos]= element;
		
		int rowcount=str.length;
		int ccount=in.length;
		
		
			
			for(int j=0;j<ccount;j++) {
				
				System.out.println(str[j]);
				con[j][0]=str[j];
				int c=in[j];
				System.out.println(c);
				con[j][1]=c;
				
			
		}
			
			int rc=con.length;
			for(int s=0;s<rc;s++) {
				int cc=con[s].length;
				for(int f=0;f<cc;f++) {
					
					System.out.print(con[s][f]+" ");
				}
				System.out.println();
			}
		
//			
//		}
//		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objArray();

	}

}
