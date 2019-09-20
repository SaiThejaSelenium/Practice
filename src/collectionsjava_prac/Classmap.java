package collectionsjava_prac;

import java.util.HashMap;
import java.util.Map;

public class Classmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4};
		String[] str= {"Hi","Welcome","To Java World","Theja"};
		
		Map<Integer, String> map=new HashMap<>();
		int len=num.length;
		//System.out.println(len);
		for (int i=0; i<len; i++) 
		{
			map.put(num[i], str[i]);
		}
		System.out.println(map.get(3));

	}

}
