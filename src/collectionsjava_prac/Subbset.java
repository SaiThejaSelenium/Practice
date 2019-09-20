package collectionsjava_prac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subbset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
		 
		if (s1.containsAll(s2)) {
		    System.out.println("s2 is a subset of s1");
		}

	}

}
