package collectionsjava_prac;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liststring= new LinkedList<String>();
		liststring.add("D");
		liststring.add("C");
		liststring.add("E");
		liststring.add("A");
		liststring.add("F");
		liststring.add("B");
		System.out.println("liststring Before Sorting:" + liststring);
		Collections.sort(liststring);
		liststring.forEach(s -> System.out.println(s));
		System.out.println("Liststring After Sorting:" + liststring);
		

	}

}
