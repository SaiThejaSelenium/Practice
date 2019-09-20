package collectionsjava_prac;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Shuffling_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= new LinkedList<Integer>();
		for (int i=0; i<=10; i++)numbers.add(i);
		System.out.println(numbers);
		Collections.shuffle(numbers);
		System.out.println(numbers);
		numbers.forEach(s->System.out.println(s));
		
	}

}
