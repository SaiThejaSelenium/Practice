package collectionsjava_prac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unique_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1= new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(2);
		s1.add(3);
		s1.add(1);
		s1.add(6);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		s1.add(10);
		//set will not allow duplicate values
		Set<Integer> listNumbers = new HashSet<>(Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6));
		System.out.println(listNumbers);
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println(uniqueNumbers);
		//s1.forEach(s->System.out.println(s));
		//System.out.println(s1);
		//Set<Integer> Uniqnum= new HashSet<>(s1);
		//Uniqnum.forEach(uni-> System.out.println(uni));
		//System.out.println(s1);

	}

}
