package collectionsjava_prac;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reversing_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num= new LinkedList<Integer>();
		for(int i=0; i<=10; i++) num.add(i);
		System.out.println(num);
		Collections.reverse(num);
		num.forEach(s-> System.out.println(s));

	}

}
