package collectionsjava_prac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
		 
		System.out.println("s1 before union: " + s1);
		 
		s1.addAll(s2);
		 
		System.out.println("s1 after union: " + s1);

	}

}
